package com.travelcard.core;

public class User {

	private String userID; 
	private TravelCard tc;
	
	
	public User(String userID) {
		this.setuserID(userID);
	}

	public String getuserID() {
		return userID;
	}

	public void setuserID(String userID) {
		this.userID = userID;
	}


}
