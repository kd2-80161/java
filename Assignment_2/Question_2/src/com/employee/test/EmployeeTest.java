package com.employee.test;

import com.employee.entity.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setSalary(4000);

		Employee employee1 = new Employee();
		employee1.setSalary(4000);

		System.out.println(employee.getSalary());
		System.out.println(employee1.getSalary());

		System.out.println("After 10 percent raise ");

		System.out.println(employee.getSalary() * 0.10 + employee.getSalary());
		System.out.println(employee1.getSalary() * 0.10 + employee1.getSalary());

	}

}

/*
 * Q2. Create a class called Employee that includes three fields—a first name
 * (type String), a last name (type String) and a monthly salary (double).
 * Provide a constructor that initializes the three instance variables. Provide
 * a set and a get method for each instance variable. If the monthly salary is
 * not positive, do not set its value. Write a test application named
 * 
 * EmployeeTest that demonstrates class Employee’s capabilities. Create two
 * Employee objects and display each object’s yearly salary. Then give each
 * Employee a 10% raise and display each Employee’s yearly salary again.
 */
