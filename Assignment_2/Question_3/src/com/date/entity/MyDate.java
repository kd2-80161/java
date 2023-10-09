package com.date.entity;

public class MyDate {
	int month;
	int day;
	int year;
	

	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}



	
	public void displayDate() {
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
