package com.empwage;

import java.util.Scanner;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		int isFullTime = 1;
		int dailyWage;
		int wagePerHr = 20;
		int workingHr;
		
		
		int empCheck= (int)(Math.floor(Math.random() *10)) % 2;
		
		if(empCheck == isFullTime) {
			System.out.println("Employee is Present");
			workingHr = 8;
		}
		else {
			System.out.println("Employee is Absent");
			workingHr = 0;
		}
		
		dailyWage = workingHr * wagePerHr;
		System.out.println("Empolyee daily wage is " + dailyWage);
	}

}
