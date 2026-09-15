package com.learning.demo;

import com.learning.model.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee employee = new Employee(101, "Adam Smith", 75000.00);

		printEmployeeDetails(employee);
	}

	public static void printEmployeeDetails(Employee employee) {
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Salary: " + employee.getSalary());
	}
}
