package com.employee;

/**
 * @author Swasthik
 *Includes Main Method which allows the company to compute Monthly Wage
 */
public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee yml = new Employee("YML", 150, 25, 120);
		Employee abc = new Employee("ABC", 120, 22, 100);
		yml.empWageBuilder();
		abc.empWageBuilder();
		System.out.println(yml);
	}
}
