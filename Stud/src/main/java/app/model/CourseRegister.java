package app.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class CourseRegister implements Serializable {
	private static final long serialVersionUID = -7433106429276926600L;
	
	//Persistency related objects
	String filename = "persistencyCourse.txt";

	// Set of courses in Course Register
	private Set<Course> CourseReg;

	// Constructor
	//@SuppressWarnings("unchecked")
	public CourseRegister() {
		Set<Course> loadedInformation = Persistency.<Course>load(filename);
		if (loadedInformation != null) {
			CourseReg = (Set<Course>) loadedInformation;
		} else {
			CourseReg = new TreeSet<Course>();
		}
	}
	
	public void save() {
	}

	// Check existence of course
	public boolean courseExists(Course c) {
		return !(CourseReg.isEmpty()) && (CourseReg.contains(c));
	}

	// Add course
	public boolean addCourse(Course c) {
		if (courseExists(c)) {
			return false;
		} else {
			CourseReg.add(c);
		
			return true;
		}
	}
	
	//Remove course
	public boolean removeCourse(Course c) {
		if (!courseExists(c)) {
			return false;
		} else {
			CourseReg.remove(c);
		
			return true;
		}
	}
	

	// Search Courses by name or course number
	public Course searchCourseByName(String courseName) {
		for (Course course : CourseReg) {
			if (course.courseName.equals(courseName)) {
				return course;
			}
		}
		return null;
	}

	public Course searchCourseByCourseNo(String CourseNo) {
		for (Course course : CourseReg) {
			if (course.courseNo.equals(CourseNo)) {
				return course;
			}
		}
		return null;

	}
	public int size() {
		return CourseReg.size();
	}

	
	public ArrayList<Course> showAll() {
		ArrayList<Course> searchResults = new ArrayList<Course>();
		for (Course course : CourseReg) {
			searchResults.add(course);
		}
		return searchResults;
	}
	
}
