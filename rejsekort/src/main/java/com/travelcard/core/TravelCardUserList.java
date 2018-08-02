package com.travelcard.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(Constants.REPORT_USER_LIST, "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		for (User u : users) {
			writer.println(u.getuserID());

		}
		writer.close();

	}

	public boolean reportExists(String reportName) {
		File tmpDir = new File(reportName);
		return tmpDir.exists();
	}

}
