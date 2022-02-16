package com.empwage;

import java.util.Scanner;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		int isFullTime = 1;
		int isPartTime = 2;
		int dailyWage;
		int wagePerHr = 20;
		int workingHr;
		
		
		int empCheck= (int)(Math.floor(Math.random() *10)) % 3;
		
		switch(empCheck) {
			case 1 :
				System.out.println("Employee is full Present");
				workingHr = 8;
				break;
			
			case 2 :
				System.out.println("Employee is part Time present");
				workingHr = 4;
				break;
		
			default :	
				System.out.println("Employee is Absent");
				workingHr = 0;
		}
		
		dailyWage = workingHr * wagePerHr;
		System.out.println("Empolyee daily wage is " + dailyWage);
	}

}
