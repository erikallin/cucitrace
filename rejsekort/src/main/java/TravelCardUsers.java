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
	
	public void exist(String name, String surname){
		
	}

	public ResponseObject addUsers(User test) {
		users.add(test);
		response = new ResponseObject(399, "card is issued"); 
		return response;
		// TODO Auto-generated method stub
		
	}

	



	
}
