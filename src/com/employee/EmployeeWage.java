package com.employee;

public class EmployeeWage {

	public static final int IS_PRESENT = 1;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		double empstatus = Math.floor(Math.random() * 10) % 2;
		if(empstatus == IS_PRESENT) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

}
