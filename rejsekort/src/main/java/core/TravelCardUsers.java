package core;

import java.util.ArrayList;
import java.util.List;

import Utils.RandomTravelCardUsers;

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

	private boolean existingUserID(User newUserID) {
		if (!users.isEmpty()) {
			if (users.contains(newUserID)) {
				return true;
			}
		}
		return false;

	}

	public void addUserID(User newUserID) {
		users.add(newUserID);

	}

}
