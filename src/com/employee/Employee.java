package com.employee;

public class Employee {
	final int IS_FULL_TIME = 1;
	final int IS_PART_TIME = 2;
	final int WAGE_PER_HOUR = 20;
	int empHour;
	int empTotalHour;
	int empWorkingDay;
	int maxWorkingDay;
	int maxWorkingHour;

	Employee() {
		empTotalHour = 0;
		empWorkingDay = 0;
		maxWorkingDay = 20;
		maxWorkingHour = 100;
	}

	public void Attendance() {
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
			DailyWage();
		}
	}
	
	public void DailyWage() {
		int empDailyWage;
		empDailyWage = WAGE_PER_HOUR * empHour;
		System.out.println("Employee Wage on Day " + empWorkingDay + " = " + empDailyWage);
		System.out.println("Employee Total Work Hour = " + empTotalHour + "\n");
	}
	
	public void TotalWage() {
		int empTotalWage;
		empTotalWage = empTotalHour * WAGE_PER_HOUR;
		System.out.println("Employee Total Monthly Wage = " + empTotalWage);
	}
}
