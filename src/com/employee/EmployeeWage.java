package com.employee;

/**
 * @author Swasthik
 *Includes Main Method which allows the company to compute Monthly Wage
 */
public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompany("YML", 150, 25, 120);
		empWageBuilder.addCompany("ABC", 120, 22, 100);
		empWageBuilder.calculateWage();
	}
}
