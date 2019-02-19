package com.employeecard.datagenerator.util;

import java.util.ArrayList;
import java.util.List;

import com.employeecard.core.AccessControl;
import com.employeecard.core.AccessControlList;

public class RandomAccessControl {
	private AccessControlList accessControls;

	private int newID() {
		return accessControls.getAccessControlIDs().size()+1;
	}

	private static int randomAccessLevelRequired() {
		return RandomUtils.randBetween(0, 3);
	}


	/**
	 * // * Generates multiple random access controls. // * @param howMany how many random
	 * access controls should the generator generate. // * @return a list that has as many
	 * access controls as the parameter howMany specifies. //
	 */

	public List<AccessControl> generate(int howMany) {
		List<AccessControl> accessControls = new ArrayList<AccessControl>();

		for (int i = 0; i < howMany; i++) {
			accessControls.add(randomEC());
		}

		return accessControls;
	}

	private AccessControl randomEC() {
		return new AccessControl(newID(), randomAccessLevelRequired());
	}

}