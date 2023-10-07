package com.employee.entity;

public class Employee {
	String first_name;
	String last_name;
	double salary;

	public Employee() {
		this.first_name = "";
		this.last_name = "";
		this.salary = 0.0;
	}

	public Employee(String first_name, String last_name, double salary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}

	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
