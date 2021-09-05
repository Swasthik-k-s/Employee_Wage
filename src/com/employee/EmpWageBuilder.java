package com.employee;

public class EmpWageBuilder {
	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	
	private CompanyEmpWage[] company = new CompanyEmpWage[10];
	private int companyCount = 0;
	
	//A new Company can be added using this method
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDay, int maxWorkingHour) {
		company[companyCount] = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDay, maxWorkingHour);
		companyCount++;
	}

	@Override
	public String toString() {
		for(int i=0;i<companyCount;i++) {
			System.out.println(company[i]);
		}
		return "";
	}

	//empWageBuilder calculates the monthly wage of a company
	public void calculateWage() {

		int empHour, empTotalHour, empWorkingDay;
		
		for(int i=0;i<companyCount;i++) {
			empHour = 0;
			empTotalHour = 0;
			empWorkingDay = 0;

			while (empTotalHour < company[i].maxWorkingHour && empWorkingDay < company[i].maxWorkingDay) {

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
			company[i].setEmpTotalWage(empTotalHour * company[i].wagePerHour);
			System.out.println(company[i]);
		}
		
	}
}

//Object of this class will be created each time a company is added
class CompanyEmpWage {
	String companyName;
	int wagePerHour;
	int maxWorkingDay;
	int maxWorkingHour;
	int empTotalWage;

	public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDay, int maxWorkingHour) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
	}

	public int getEmpTotalWage() {
		return empTotalWage;
	}

	public void setEmpTotalWage(int empTotalWage) {
		this.empTotalWage = empTotalWage;
	}

	@Override
	public String toString() {
		return " [Company=" + companyName + ", Monthly Wage=" + empTotalWage + "]";
	}
	
	
}
