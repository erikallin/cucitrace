package app.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Grade {
	int grade;
	
	//List of accepted grades
	ArrayList<Integer> acceptedGrades = new ArrayList<Integer>(Arrays.asList(-3,00,02,4,7,10,12));
	
	public boolean validGrade(int grades) {
		return (acceptedGrades.contains(grades));
	}
	
	public int getGrades() {
		return grade;
	}

	public boolean setGrades(int grades) {
		if (validGrade(grades)) {
			this.grade = grades;
			return true;
		} else {
			return false;
		}
	}
}
