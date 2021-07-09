package com.bridgelabz.empwage;

import java.util.ArrayList;
import java.util.List;

public class EmpWageManager extends EmpWageBuilder {
	public static final int IS_PART_TIME = 4;
	public static final int IS_FULL_TIME = 8;
	List<Object> companyList = new ArrayList<Object>();
	
	public void add(EmpWageBuilder empWagebuilder) {
		companyList.add(empWagebuilder);
	}
	
	public void delete(EmpWageBuilder empWagebuilder) {
		companyList.remove(empWagebuilder);
	}
	
	public void print() {
		for(Object empWagebuilder:companyList) {
			System.out.println(empWagebuilder);
		}
	}
	
	public void wage(EmpWageBuilder empWagebuilder) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays<numOfWorkingDays){
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck){
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day :"+totalWorkingDays+" Emp Hrs:"+empHrs);
		}
		int totalEmpWage = totalEmpHrs*empRatePerHour;
		System.out.println("Total EmpWage for company: "+company+"is: "+totalEmpWage);
	}
}
	
	


