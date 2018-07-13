package Cucumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import app.model.Course;
import app.model.CourseRegister;
import app.model.DTUStudent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionEnrollCourse extends regist {
	CourseRegister CR = new CourseRegister();
	String courseTitleEnrolling;
	Course courseEnrolling;
	Course Mathematics1 = new Course("01006", "Mathematics", "General Engineering", "5");
	
	//Succesfully enrolled in the course
	@Given("^a user who wants to enroll in the course \"([^\"]*)\"$")
	public void a_user_who_wants_to_enroll_in_the_course(String courseName) {
		courseTitleEnrolling = courseName;
	}

	@And("^the course existence status is true$")
	public void the_course_existence_status_is_true() {
		courseEnrolling = CR.searchCourseByName(courseTitleEnrolling);
		assertTrue(courseEnrolling != null);
	}

	@And("^the user-course-existence status is false$")
	public void the_user_course_existence_status_is_false() {
		Cristian=new DTUStudent("Cristian", "Botezatu","1234567892");
		assertFalse(courseEnrolling.studentEnrolmentStatus(Cristian));
	}
	
	
	@When("^the user signs up for the course$")
	public void the_user_signs_up_for_the_course() {
	    // Nothing really happens here
	}
	
	
	@Then("^the user will be enrolled in the course$")
	public void the_user_will_be_enrolled_in_the_course() {
		courseEnrolling.addStudent(Cristian);
	}

	
	@Then("^the user course-existance status is true$")
	public void the_user_course_existance_status_is_true() {
	    assertTrue(courseEnrolling.studentEnrolmentStatus(Cristian));
	}
	
	
	//unsuccessful enrollment in course
	@And("^the course existence status is false$")
	public void the_course_existence_status_is_false() {
	    courseEnrolling = CR.searchCourseByName(courseTitleEnrolling);
		assertTrue(courseEnrolling == null);
	}
	
	
	@And("^the user-course-existence status is true$")
	public void the_user_course_existence_status_is_true() {
		DTUStudent Cristian = new DTUStudent("Cristian", "Botezatu", "1234567892");
		courseEnrolling.addStudent(Cristian);
		assertTrue(courseEnrolling.studentEnrolmentStatus(Cristian));
	}


	@Then("^the user will be presented with an error, that he is already enrolled$")
	public void the_user_will_be_presented_with_an_error_that_he_is_already_enrolled() {
		courseEnrolling.addStudent(Cristian);
	}
	
	@Then("^the user will be presented with an error message that the course does not exist$")
	public void the_user_will_be_presented_with_an_error_message_that_the_course_does_not_exist() {
		assertTrue(courseEnrolling == null);
	}
}
