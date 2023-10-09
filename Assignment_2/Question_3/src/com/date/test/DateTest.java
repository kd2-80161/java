package com.date.test;

import com.date.entity.MyDate;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate();
		
		date.setDay(7);
		date.setMonth(10);
		date.setYear(2023);
		date.displayDate();
	}

}
