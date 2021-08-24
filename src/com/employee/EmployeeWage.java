package com.employee;

public class EmployeeWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int empDailyWage;
		int empHour;
		int empstatus = (int) Math.floor(Math.random() * 10) % 3;
		switch(empstatus) {
		case IS_FULL_TIME:
			System.out.println("Full Time Employee");
			empHour = 8;
			break;
		case IS_PART_TIME:
			System.out.println("Part Time Employee");
			empHour = 4;
			break;
		default:
			empHour = 0;
		}
		empDailyWage = WAGE_PER_HOUR * empHour;
		System.out.println("Employee Daily Wage = " + empDailyWage);
	}

}
