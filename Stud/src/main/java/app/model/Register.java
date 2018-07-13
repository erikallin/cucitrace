package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
public class Register implements Serializable {
	private static final long serialVersionUID = 5057209122447393507L;

	// Persistency related objects
	String filename = "persistencyUser.txt";

	// User Register
	private Set<User> reg;

	// Constructor
	public Register() {

		System.out.println("User registered");
	}

	public void save() {
			System.out.println("saved");
	}

	// Check existence of user
	public boolean userExists(User user) {
		return reg.contains(user);
	}

	// Check if user is student
	public boolean isStudent(User user) {
		return (user instanceof DTUStudent);
	}

	// Sign up user in system
	public void signUp(User user) {
		if (user instanceof DTUStudent) {
			((DTUStudent) user).studentId(reg.size());
			((DTUStudent) user).studentEmail();
		}
		reg.add(user);
		this.save();
	}

	// Remove user in system
	public boolean remove(User user) {
		if (reg.contains(user)) {
			reg.remove(user);
			this.save();
			return true;
		} else {
			return false;
		}
	}

	// Searching users in system
	public ArrayList<User> searchUserByName(String name) {
		ArrayList<User> searchResults = new ArrayList<User>();
		for (User user : reg) {
			if (user.firstName.equals(name) || user.lastName.equals(name)) {
				searchResults.add(user);
				
			}
		}
		return searchResults;
	}
	
	
	public User searchUserById(String id) {
		for (User user : reg) {
			if (user.id.equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	public ArrayList<User> showAll() {
		ArrayList<User> searchResults = new ArrayList<User>();
		for (User user : reg) {
			searchResults.add(user);
		}
		return searchResults;
	}

	
}