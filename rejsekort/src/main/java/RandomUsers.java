
import java.util.ArrayList;
import java.util.List;

public class RandomUsers {


	private static final String[] FIRST_NAMES = { "Bob", "Joe", "Tim", "Bethany", "Donald", "Mickey", "John", "George",
			"Dick", "James", "Timothy", "Joanne", "Angus" };

	private static final String[] LAST_NAMES = { "Doe", "Smith", "Bond", "Jackson", "Jordan", "Young", "Page",
			"Johnson", "Springsteen", "Kauffman", "Schmidt", "Jokinen" };

	private static final String[] CPR_NUMBERRS = { "1012921234", "1012921234", "1012921234", "1012921234", "1012921234",
			"1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234" };

	/**
	 * // * Generates multiple random users. // * @param howMany how many random
	 * users should the generator generate. // * @return a list that has as many
	 * users as the parameter howMany specifies. //
	 */
	public List<User> generate(int howMany) {
		List<User> users = new ArrayList<>();

		for (int i = 0; i < howMany; i++) {
			users.add(randomUser());
		}

		return users;
	}

	/**
	 * Generates a random book.
	 */
	public User randomUser() {
		String name = randomName();
		String lname = randomLastName();
		String cpr = randomCPR();

		return new User(name, lname, cpr);
	}
	//

	private static String randomName() {
		String subject = RandomUtils.randomFromArray(FIRST_NAMES);
		return subject;
	}

	private static String randomLastName() {
		String subject = RandomUtils.randomFromArray(LAST_NAMES);
		return subject;
	}

	private static String randomCPR() {
		String subject = RandomUtils.randomFromArray(CPR_NUMBERRS);
		return subject;
	}


}
