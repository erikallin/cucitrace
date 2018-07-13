package app.model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class DTUStudent extends User implements Serializable {
	private static final long serialVersionUID = 8285487186133938727L;

	// Attributes of a DTU Student

	int grade, phoneNumber; 

	// Courses taken and grades
	private Map<Course, Grade> takenCourses = new TreeMap<Course, Grade>();

	// Constructor
	public DTUStudent(String firstName, String lastName, String cpr) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setCpr(cpr);
		this.role = "Student";
		setPassword();
	}
	
	public Grade getGrade(Course course) {
		return takenCourses.get(course);
	}

	// Generating Student Id and email
	public void studentId(int uniqueid) {
		final DecimalFormat IDFormat = new DecimalFormat("0000");
		id = "s" + "18" + IDFormat.format(uniqueid);
	}

	public void studentEmail() {
		this.email = id + "@student.dtu.dk";
	}

	// Course and grade methods
	public void addCourse(Course course) {
		if (!takenCourses.containsKey(course)) {
		takenCourses.put(course, null);
		}else {
			throw new NullPointerException();
		}
	}

	public boolean removeCourse(Course course, Grade grade) {
		if (grade == null) {
			takenCourses.remove(course);
			return true;
		} else {
			return false;
		}
	}
	
	public void setGrade(Course course, Grade grade) {
		takenCourses.put(course, grade);
	}

	public Map<Course, Grade> getTakenCoursesWithGrades() {
		return takenCourses;
	}
	public ArrayList<String> getTakenCourseNames() {
		ArrayList<String> allCourses = new ArrayList<String>();
		for (Course course : takenCourses.keySet()) {
			allCourses.add(course.getCourseName());
			}
		return allCourses;

	}



	//are Prerequisites met
	public boolean prerequisitesMet(Course course) {
		int i=0;
		for (Course c : takenCourses.keySet() ) {
			
			if (course.getPrerequisites().contains(c)) {
				i++;
			}
			
		}
		if (i==course.getPrerequisites().size()) {
			return true;
		} else return false;
		
	}
	
}
