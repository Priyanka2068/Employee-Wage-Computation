package com.bridgelabz.employeeWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome TO Employee Wage Computation");
		
		int is_present= 1;
		int Emp_wage_per_hr = 20;
		int working_hr = 8;
		
		double emp_attendance = Math.floor(Math.random ()* 10) % 2;
		
		int daily_wage = working_hr * Emp_wage_per_hr ;
		
		if ( emp_attendance == is_present )
			System.out.println("Employee is Present & working hr = "+ working_hr + " hr " + "  daily wage = " + daily_wage);
		else
			System.out.println("Employee is Absent");

	}

}
