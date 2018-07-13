package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Course implements Comparable<Course>, Serializable {
	private static final long serialVersionUID = 8132094133089833105L;

	// Course Attributes
	String courseNo, courseName, courseType, description, schedule;
	String avgrade;
	String ects;
	Object department;

	
	CourseRegister cReg;


	// Sets course holds
	private Set<DTUStudent> enrolledStudents = new TreeSet<DTUStudent>();
	private Set<Employee> assignedProfessors = new TreeSet<Employee>();
	private Set<DTUStudent> assignedTas = new TreeSet<DTUStudent>();
	private Set<Course> prerequisites = new TreeSet<Course>();

	// Getters and Setters

	// Course number
	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	

	// Ects
	public String getECTS() {
		return ects;
	}

	public void setECTS(String ects) {
		this.ects = ects;
	}

	// CourseName
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	// CourseType
	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	// Course Description
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Course Department
	public String getDepartment() {
		return department.toString();
	}

	public void setDepartment(Object department) {
		this.department = department;
	}
	
	//Schedule
	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	

	// Course prerequisites
	

	// Constructor
	public Course(String courseNo, String courseName, Object department, String ects) {
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.ects = ects;
		this.department = department;
	}

	public Set<Course> getPrerequisites() {
		return prerequisites;
	}
	
	public Set<Course> removetPrerequisites(Course course) {
		prerequisites.remove(course);
		return prerequisites;
	}

	public void addPrerequisites(Course course) {
		cReg= new CourseRegister();
		if (!prerequisites.contains(course)) {
			prerequisites.add(course);
			cReg.save();
			
		} else {
			//Throw exception if it exists 
			throw new NullPointerException();
		}
	}

	public Set<DTUStudent> getEnrolledStudents() {
		return enrolledStudents;
	}

	// Add, remove and get study program
	
	// DO WE NEED THIS? 
	/*
	public void addStudyProgram(StudyProgram studyprogram) {
		if (!(this.belongsToStudyProgram(studyprogram))) {
			relatedStudyPrograms.add(studyprogram);
			studyprogram.addCourse(this);
		} else {
			
			throw new NullPointerException();
			
		}

	}

	public void removeStudyProgram(StudyProgram studyprogram) {
		relatedStudyPrograms.remove(studyprogram);
	}

	public Set<StudyProgram> getRelatedStudyPrograms() {
		return relatedStudyPrograms;
	}
*/
	// Enroll students and check enrollment status
	public void addStudent(DTUStudent student) {
		if (!(studentEnrolmentStatus(student))) {
			enrolledStudents.add(student);
			student.addCourse(this);
		}
	}
	
	public boolean removeStudent(DTUStudent student) {
		if (studentEnrolmentStatus(student)) {
			return true;
		} else {
			enrolledStudents.remove(student);
			student.removeCourse(this, null);
		}
		return false;
	}

	public boolean studentEnrolmentStatus(DTUStudent student) {
		return !(enrolledStudents.size() == 0) && (enrolledStudents.contains(student));
	}

	
	// Add professor to course
	public void addProfessor(Employee professor) {
		if (professorInCourse(professor)) {
			throw new NullPointerException();
		} else {
			assignedProfessors.add(professor);
			professor.addCourse(this);
		}
	}
	

	// Switch professor to course
	public void removeProfessor(Employee professor) {
		if (professorInCourse(professor)) {
			assignedProfessors.remove(professor);
		} 
	}
	public ArrayList<Employee> showAssignedProfessors(){
		ArrayList<Employee> allProf = new ArrayList<Employee>();
		for (Employee prof: assignedProfessors) {
			allProf.add(prof);
		}
		return allProf;
	}
	// Add TAs
	public void addTa(DTUStudent student) {
		if (taInCourse(student)) {
			throw new NullPointerException();
		} else {
			assignedTas.add(student);
		}
	}

	// remove TAs course
	public void removeTa(DTUStudent ta) {
		if (taInCourse(ta)) {
			assignedTas.remove(ta);	
		}
	}

	// Check if professor or Ta is in course
	public boolean professorInCourse(Employee professor) {
		return (!(assignedProfessors.size() == 0) && (assignedProfessors.contains(professor)));
	}

	public boolean taInCourse(DTUStudent student) {
		return (!(assignedTas.size() == 0) && (assignedTas.contains(student)));
	}
	
	
	//Output assigned professors
	public ArrayList<String> outputAssignedProffessors() {
		ArrayList<String> output = new ArrayList<String>();
		for (Employee prof : assignedProfessors) {
			output.add(prof.getId());
		}
		return output;
	}
	
	public ArrayList<String> outputAssignedTa() {
		ArrayList<String> output = new ArrayList<String>();
		for (DTUStudent Ta : assignedTas) {
			output.add(Ta.getId());
		}
		return output;
	}


	
	// Compareables
	@Override
	public int compareTo(Course otherCourse) {
		return courseNo.compareTo(otherCourse.courseNo);
	}

}
