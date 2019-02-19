package com.employeecard.datagenerator.util;

import java.util.ArrayList;
import java.util.List;

import com.employeecard.core.Canteen;

public class RandomCanteen {
	private static final String[] CANTEEN_NAMES = { "Meyers", "ISS", "Shackenborg", "Eurest", "Europa 1989", "Green kitchen",
			"DTU Student Canteen 101", "KU Student Canteen", "SDU Student Canteen", "DTU Student Canteen 341" };

	private static Canteen randomCanteen() {

		Canteen canteen = new Canteen(RandomUtils.randomFromArray(CANTEEN_NAMES));
		canteen.setCountWithdrawals(RandomUtils.randBetween(0, 10));
		canteen.setCountDeposits(RandomUtils.randBetween(0, 10));
		return canteen;
	}

	/**
	 * // * Generates multiple random users. // * @param howMany how many random
	 * users should the generator generate. // * @return a list that has as many
	 * users as the parameter howMany specifies. //
	 */

	public List<Canteen> generate(int howMany) {
		List<Canteen> canteens = new ArrayList<Canteen>();

		for (int i = 0; i < howMany; i++) {
			canteens.add(randomCanteen());
		}

		return canteens;
	}

}
