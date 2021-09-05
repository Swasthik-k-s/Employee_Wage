package com.employee;

public interface ComputeEmpWage {
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDay, int maxWorkingHour);
	
	public void calculateWage();
}
