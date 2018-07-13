package app.controller;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import app.model.Course;
import app.model.CourseRegister;
import app.model.DTUStudent;
import app.model.Register;
public class StudentController {

	private DTUStudent student;

	Register reg;
	CourseRegister courseReg;
	//StudentPanel sp = new StudentPanel();
	
	
	public StudentController() {
		reg = new Register();
		courseReg= new CourseRegister();
		
	}

	

	public boolean addStudent(String firstName, String lastName, String cprNumber, Object studyProgram, String address, String phoneNumber) {
		
		
		if (firstName.matches(".*\\d+.*") || lastName.matches(".*\\d+.*")) {
			JOptionPane.showMessageDialog(null, "Invalid name!", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			try {
			Integer.parseInt(cprNumber);
			if (cprNumber.length() != 10) {
					JOptionPane.showMessageDialog(null, "Invalid CPR number!\nThe CPR has the following format:\nddmmyyxxxx ",
							"Error", JOptionPane.ERROR_MESSAGE);
					
			}else {
				
				if (reg.userExists(new DTUStudent(firstName, lastName, cprNumber))) {
					JOptionPane.showMessageDialog(null,
							"The student " + firstName + " " + lastName + " already exists!",
							"Error", JOptionPane.ERROR_MESSAGE);
				}else if (studyProgram.toString()=="") {
					JOptionPane.showMessageDialog(null,
							"Choose a study program!",
							"Error", JOptionPane.ERROR_MESSAGE);				
				}
				else {
				
				student = new DTUStudent(firstName, lastName, cprNumber);
			//	student.setStudyProgram(studyProgramReg.searchStudyProgramRegByName((String) studyProgram));
				student.setAddress(address);
				
				try {
					student.setPhonenumber(Integer.parseInt(phoneNumber));

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Invalid format for phone number!", "Number Format Error",
							JOptionPane.ERROR_MESSAGE);
				}
				reg.signUp(student);
				JOptionPane.showMessageDialog(null, "The student" + student.getId() + " is added to the system!",
						"Student added", JOptionPane.PLAIN_MESSAGE);
					
					return true;
					
				
					}
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid format for CPR!", "Number Format Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		return false;
	}
	
	
	public void addcourse(DTUStudent student, String courseName, JFrame searchFrame){
		
		CourseRegister newCourseReg = new CourseRegister();
		Register register = new Register();
		
		Course searchedCourse = newCourseReg.searchCourseByName(courseName);
		DTUStudent searchedStudent = (DTUStudent) register.searchUserById(student.getId());
		
		try {
			searchedCourse.addStudent(searchedStudent);
			
			newCourseReg.save();
			register.save();
			
			JOptionPane.showMessageDialog(null, "You have succesfully enrolled to the course " + courseName , "Course Enrollment",
					JOptionPane.INFORMATION_MESSAGE);
			searchFrame.setVisible(false);
			
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "You are already enrolled to the course " +courseName, "Already existing Course",
					JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
}
