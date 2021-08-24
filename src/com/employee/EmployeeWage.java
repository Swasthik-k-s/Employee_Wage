package com.employee;

public class EmployeeWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HOURS = 100;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int empDailyWage =0;
		int empHour = 0;
		int empTotalWage = 0;
		int empTotalHour = 0;
		int empWorkingDay = 0;
		while (empTotalHour < MAX_WORKING_HOURS && empWorkingDay < MAX_WORKING_DAYS) {
			empWorkingDay++;
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
			empDailyWage = WAGE_PER_HOUR * empHour;
			System.out.println("Employee Wage on Day " + empWorkingDay + " = " + empDailyWage);
			System.out.println("Employee Total Work Hour = " + empTotalHour + "\n");
		}
		empTotalWage = empTotalHour * WAGE_PER_HOUR;
		System.out.println("Employee Total Monthly Wage = " + empTotalWage);
	}

}
