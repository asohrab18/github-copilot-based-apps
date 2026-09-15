package com.learning.demo;

import com.learning.model.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee employee = new Employee(101, "Adam Smith", 75000.00);

		printEmployeeDetails(employee);
	}

	public static void printEmployeeDetails(Employee employee) {
		System.out.printf("Employee ID: %d%nEmployee Name: %s%nSalary: %.2f%n",
				employee.getId(), employee.getName(), employee.getSalary());
	}
}
