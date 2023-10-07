package pkg1;

import java.util.Scanner;

public class Ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int numOne = Sc.nextInt();
		
		System.out.println("In Binary");
		System.out.println(Integer.toBinaryString(numOne));
		System.out.println("In Octal");
		System.out.println(Integer.toOctalString(numOne));
		System.out.println("In Hexadecimal");
		System.out.println(Integer.toHexString(numOne));
		Sc.close();

	}

}
