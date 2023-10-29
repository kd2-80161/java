

package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;


public class Employee {
	private int empid;
	private String name;
	private double sal;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(int empid, String name, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	public void acceptEmployee() {
		System.out.println("Enter Empid: ");
		setEmpid(new Scanner(System.in).nextInt());
		System.out.println("Enter Name: ");
		setName(new Scanner(System.in).next());
		System.out.println("Enter Sal: ");
		setSal(new Scanner(System.in).nextDouble());
		
		
	}
	public Employee() {
		super();
		this.empid = 0;
		this.name = "";
		this.sal =0.0;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Employee other = (Employee) obj;
		if((other.getEmpid()-this.getSal())==0) {
			return true;
		}
		return false; 
				}
}
