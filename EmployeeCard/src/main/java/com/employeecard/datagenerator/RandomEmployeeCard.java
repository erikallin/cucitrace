package com.employeecard.datagenerator.util;

import java.util.ArrayList;
import java.util.List;

import com.employeecard.core.EmployeeCard;

public class RandomEmployeeCard {
	private static final String[] CPR_NUMBERS = { "1012921234", "1012921234", "1012921234", "1012921234", "1012921234",
			"1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234" };

	private static int randomBalance() {
		return RandomUtils.randBetween(150, 312);
	}

	private static int randomAccessLevel() {
		return RandomUtils.randBetween(0, 2);
	}

	private static String randomCPR() {
		return RandomUtils.randomFromArray(CPR_NUMBERS);
	}

	/**
	 * // * Generates multiple random users. // * @param howMany how many random
	 * users should the generator generate. // * @return a list that has as many
	 * users as the parameter howMany specifies. //
	 */

	public List<EmployeeCard> generate(int howMany) {
		List<EmployeeCard> users = new ArrayList<EmployeeCard>();

		for (int i = 0; i < howMany; i++) {
			users.add(randomEC());
		}

		return users;
	}

	private EmployeeCard randomEC() {
		return new EmployeeCard(randomCPR(), randomBalance(), randomAccessLevel(), false);
	}

}