package core;

import java.util.ArrayList;
import java.util.List;

import DataGeneratorUtil.RandomTravelCardUsers;

public class TravelCardUsers {

	private List<User> users;

	public List<User> getUserIDs() {
		return users;
	}

	public void setuserIDs(List<User> users) {
		this.users = users;
	}

	public TravelCardUsers() {
		users = new ArrayList<>();
		RandomTravelCardUsers rru = new RandomTravelCardUsers();
		users = rru.generate(10);

	}

	public void addUserID(User newUserID) {
		users.add(newUserID);

	}

}
