import java.util.ArrayList;
import java.util.List;

public class TravelCardUsers {

	private List<User> users;

	ResponseObject response;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public TravelCardUsers() {
		users = new ArrayList<>();
		RandomUsers rru = new RandomUsers();
		users = rru.generate(10);

	}

	private boolean existingUser(User newUser) {
		if (!users.isEmpty()) {
			if (users.contains(newUser)) {
				return true;
			}
		}
		return false;

	}

	public ResponseObject addUser(User newUser) {
		if (existingUser(newUser)) {
			response = new ResponseObject(100, "New User Not Okay");
		} else {
			users.add(newUser);
			response = new ResponseObject(110, "New User Okay");
		}

		return response;
		// TODO Auto-generated method stub

	}

}
