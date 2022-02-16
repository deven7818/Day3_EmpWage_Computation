package com.empwage;


public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int workingHr=0;
		int totalWorkingHr=0;
		int daysInMonth=20;
		int maxWorkingHrs = 100;
		int monthlyTotalWage=0;
		int dailyWageArray[] = new int[20];
		
		for(int i=0; i<daysInMonth && totalWorkingHr<maxWorkingHrs ; i++) {
			
			int empCheck= (int)(Math.floor(Math.random() *10)) % 3;
		
			switch(empCheck) {
				case 1 :
					
					workingHr = 8;
					break;
			
				case 2 :
					
					workingHr = 4;
					break;
		
				default :	
					
					workingHr = 0;
			}
			totalWorkingHr += workingHr;
			dailyWageArray[i] = workingHr * wagePerHr;
		}	
		
		for(int j=0; j<daysInMonth; j++) {
			int day = j+1;
			System.out.println("Day " + day + " wage is " + dailyWageArray[j]);
			monthlyTotalWage = monthlyTotalWage + dailyWageArray[j];
		}
		System.out.println("\n Monthly wage is " + monthlyTotalWage);
	}

}
