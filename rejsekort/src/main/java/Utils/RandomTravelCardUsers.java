package Utils;

import java.util.ArrayList;
import java.util.List;

import core.CPR;

public class RandomTravelCardUsers {
	private static final String[] CPR_NUMBERS = { "1012921234", "1012921234", "1012921234", "1012921234", "1012921234",
			"1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234" };
	
	private static CPR randomCPR() {
		
		CPR cpr= new CPR( RandomUtils.randomFromArray(CPR_NUMBERS));
		return cpr;
	}

	/**
	 * // * Generates multiple random users. // * @param howMany how many random
	 * users should the generator generate. // * @return a list that has as many
	 * users as the parameter howMany specifies. //
	 */

	public List<CPR> generate(int howMany) {
		List<CPR> users = new ArrayList<CPR>();

		for (int i = 0; i < howMany; i++) {
			users.add(randomCPR());
		}

		return users;
	}
	
}