package com.employee;

public class Employee {
	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	String companyName;
	private int wagePerHour;
	int maxWorkingDay;
	int maxWorkingHour;
	int empTotalWage;

	//Constructor is used to get the values while creating a object
	public Employee(String companyName, int wagePerHour, int maxWorkingDay, int maxWorkingHour) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
	}

	//empWageBuilder calculates the monthly wage of a company
	public void empWageBuilder() {
		
		int empHour, empTotalHour, empWorkingDay;
		empHour = 0;
		empTotalHour = 0;
		empWorkingDay = 0;
		
		while (empTotalHour < maxWorkingHour && empWorkingDay < maxWorkingDay) {
			
			int empstatus = (int) Math.floor(Math.random() * 10) % 3;
			
			switch (empstatus) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
			case IS_PART_TIME:
				empHour = 4;
				break;
			default:
				empHour = 0;
			}
			empTotalHour += empHour; 
			empWorkingDay++;
		}
		
		empTotalWage = empTotalHour * wagePerHour;
		System.out.println("Company : " + companyName);
		System.out.println("Employee Total Monthly Wage = " + empTotalWage);
	}

	@Override
	public String toString() {
		return "Company : " + companyName + "\nEmployee Total Monthly Wage = " + empTotalWage;
	}
}
