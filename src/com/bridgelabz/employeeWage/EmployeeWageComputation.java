package com.bridgelabz.employeeWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome TO Employee Wage Computation");
		
		int is_present= 1;
		double emp_attendance = Math.floor(Math.random ()* 10) % 2;
		if ( emp_attendance == is_present )
		System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
