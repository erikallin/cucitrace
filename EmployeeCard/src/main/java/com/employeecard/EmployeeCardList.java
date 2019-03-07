package com.employeecard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.employeecard.datagenerator.RandomEmployeeCard;

public class EmployeeCardList {

	
	private List<EmployeeCard> employees;

	
	public EmployeeCardList() {
		employees = new ArrayList<EmployeeCard>();
		RandomEmployeeCard reu = new RandomEmployeeCard();
		employees = reu.generate(10);

	}

	
	
	
	
	public void addEmployeeID(EmployeeCard newEmployeeID) {
		employees.add(newEmployeeID);

	}

	
	
	
	
	public void generateEmployeeList() {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(Constants.REPORT_EMPLOYEE_LIST, "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		for (EmployeeCard u : employees) {
			writer.println(u.getEmployeeID());

		}
		writer.close();

	}

	
	
	
	
	public List<EmployeeCard> getEmployeeIDs() {
		return employees;
	}

	
	
	
	
	public boolean reportExists(String reportName) {
		File tmpDir = new File(reportName);
		return tmpDir.exists();
	}

	
	
	
	
	public void setEmployeeIDs(List<EmployeeCard> employees) {
		this.employees = employees;
	}

	
	
	
	
}
