package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
	private int roll;
	private String name;
	private String city;
	private double marks;

	public int getRoll() {
		return roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class StudentCityMarksNameComparator implements Comparator<Student> {
			@Override
			public int compare(Student e1, Student e2) {

				int diff = e2.getCity().compareTo(e1.getCity());
				if (diff == 0)
					diff = Double.compare(e2.getMarks(), e1.getMarks());
				if (diff == 0)
					diff = e1.getName().compareTo(e2.getName());
				return diff;
			}
		}
		
		Student[] arr = new Student[5];
		arr[0] = new Student(3, "Nilesh", "LKO",90000.0);
		arr[1] = new Student(1, "Sarang", "LTT",70000.0);
		arr[2] = new Student(4, "Prashant", "KRD",60000.0);
		arr[3] = new Student(5, "Prashant", "LKO",30000.0);
		arr[4] = new Student(2, "Nitin", "LTT",40000.0);

		System.out.println("Before Sort: ");
		for (Student e : arr)
			System.out.println(e);
		
		StudentCityMarksNameComparator stu = new StudentCityMarksNameComparator();
				
		
		Arrays.sort(arr,stu);
		
		System.out.println("After Sort: ");
		for (Student student : arr) {
			System.out.println(student);
		}
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
}
