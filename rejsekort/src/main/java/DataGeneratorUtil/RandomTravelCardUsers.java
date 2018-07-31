package DataGeneratorUtil;

import java.util.ArrayList;
import java.util.List;

import core.User;

public class RandomTravelCardUsers {
	private static final String[] CPR_NUMBERS = { "1012921234", "1012921234", "1012921234", "1012921234", "1012921234",
			"1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234" };
	
	private static User randomCPR() {
		
		User user= new User( RandomUtils.randomFromArray(CPR_NUMBERS));
		return user;
	}

	/**
	 * // * Generates multiple random users. // * @param howMany how many random
	 * users should the generator generate. // * @return a list that has as many
	 * users as the parameter howMany specifies. //
	 */

	public List<User> generate(int howMany) {
		List<User> users = new ArrayList<User>();

		for (int i = 0; i < howMany; i++) {
			users.add(randomCPR());
		}

		return users;
	}
	
}