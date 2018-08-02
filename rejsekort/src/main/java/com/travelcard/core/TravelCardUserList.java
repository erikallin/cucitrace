package com.travelcard.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.travelcard.datagenerator.util.RandomTravelCardUsers;

public class TravelCardUserList {

	private List<User> users;
	
	public List<User> getUserIDs() {
		return users;
	}

	public void setuserIDs(List<User> users) {
		this.users = users;
	}

	public TravelCardUserList() {
		users = new ArrayList<>();
		RandomTravelCardUsers rru = new RandomTravelCardUsers();
		users = rru.generate(10);

	}

	public void addUserID(User newUserID) {
		users.add(newUserID);

	}

	public void generateNameList() {
		
		
		
	}

	public boolean reportExists(String reportName) {
		File tmpDir = new File(reportName);
		return true; //tmpDir.exists();
	}

}
