package app.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Department {
	Object department;
	
	//List of accepted grades
	ArrayList<Object> departments = new ArrayList<Object>(Arrays.asList("DTU Compute", "DTU Physics", "DTU Mechanical Engineering", "DTU Photonics", "DTU Energy","DTU Wind Energy"));
	
	public ArrayList<Object> getDepartments() {
		return departments;
	}
	
}
