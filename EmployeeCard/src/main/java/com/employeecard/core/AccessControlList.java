package com.employeecard.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.employeecard.datagenerator.util.RandomAccessControl;

public class AccessControlList {

	
	private List<AccessControl> accessControls;

	
	public AccessControlList() {
		accessControls = new ArrayList<AccessControl>();
		RandomAccessControl rru = new RandomAccessControl();
		accessControls = rru.generate(10);

	}

	
	
	
	
	public void addAccessControlID(AccessControl newAccessControlID) {
		accessControls.add(newAccessControlID);

	}

	
	
	
	
	public void generateAccessControlList() {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(Constants.REPORT_ACCESS_CONTROL_LIST, "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		for (AccessControl u : accessControls) {
			writer.println(u.getaccessControlID());

		}
		writer.close();

	}

	
	
	
	
	public List<AccessControl> getAccessControlIDs() {
		return accessControls;
	}

	
	
	
	
	public boolean reportExists(String reportName) {
		File tmpDir = new File(reportName);
		return tmpDir.exists();
	}

	
	
	
	
	public void setAccessControlIDs(List<AccessControl> accessControls) {
		this.accessControls = accessControls;
	}

	
	
	
	
}
