package app.model;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class Employee extends User implements Serializable {
	private static final long serialVersionUID = -8734597871604668369L;

	//Attributes of Employee
	int phoneNumber;
	Object department;
	private Set <Course> assignedCourses = new TreeSet <Course>();
	

	//Constructor 
	public Employee(String firstName, String lastName, String cpr, String roleGiven) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.setCpr(cpr);
		this.setRole(roleGiven);
		initials();
		email();
		setPassword();
	}
	
	
	//Setting Initials
	public void initials() {
		this.id = ("" + firstName.charAt(0) + firstName.charAt(1) + lastName.charAt(0) + lastName.charAt(1)).toLowerCase(); 
	}
	
	//Generating email
	public void email() {
		email=id+"@dtu.dk";
	}
	
	//Assigned courses
	public void addCourse(Course course) {
		assignedCourses.add(course);
	}
	
	public Set<Course> getCoursesAssigned() {
		return assignedCourses;
	}
}
