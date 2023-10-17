package com.sunbeam;

import java.util.Scanner;

public class Question_2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		String s = Sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		System.out.println(sb.toString());
	}

}
