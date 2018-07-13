package app.model;

public class LogIn {
	public static boolean correctCredentials(String Id,String password,Register reg) {
		return (reg.searchUserById(Id) != null) && (reg.searchUserById(Id).password.equals(password));
	}
}
