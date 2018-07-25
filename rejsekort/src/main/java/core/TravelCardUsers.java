package core;

import java.util.ArrayList;
import java.util.List;

import Utils.RandomTravelCardUsers;

public class TravelCardUsers {

	private List<CPR> users;

	public List<CPR> getCPRs() {
		return users;
	}

	public void setCPRs(List<CPR> users) {
		this.users = users;
	}

	public TravelCardUsers() {
		users = new ArrayList<>();
		RandomTravelCardUsers rru = new RandomTravelCardUsers();
		users = rru.generate(10);

	}

	private boolean existingCPR(CPR newCPR) {
		if (!users.isEmpty()) {
			if (users.contains(newCPR)) {
				return true;
			}
		}
		return false;

	}

	public void addCPR(CPR newCPR) {
		users.add(newCPR);

	}

}
