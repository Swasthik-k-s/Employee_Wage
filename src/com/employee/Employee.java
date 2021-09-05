package com.employee;

public class Employee {
	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;

	public static void calculateWage(String companyName, int wagePerHour,  int maxWorkingDay, int maxWorkingHour) {
		
		int empHour, empTotalHour, empWorkingDay, empTotalWage;
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
}
