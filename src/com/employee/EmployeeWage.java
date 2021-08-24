package com.employee;

public class EmployeeWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS = 20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int empDailyWage =0;
		int empHour = 0;
		int empTotalWage = 0;
		for (int i = 0; i < WORKING_DAYS; i++) {
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
			empDailyWage = WAGE_PER_HOUR * empHour;
			empTotalWage += empDailyWage; 
			System.out.println("Employee Wage on Day " + (i + 1) + " = " + empDailyWage);
		}
		System.out.println("Employee Total Monthly Wage = " + empTotalWage);
	}

}
