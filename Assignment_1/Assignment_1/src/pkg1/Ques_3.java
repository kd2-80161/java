/*
Display food menu to user. User will select items from menu along with the quantity. 
(eg 1. Dosa
2. Samosa 
3. Idli ... 10 . Generate Bill )
 
Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
*/
package pkg1;

import java.util.Scanner;

public class Ques_3 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Press 0 to exit");
		int choice = Sc.nextInt();
		int sum=0;

		while (choice != 0) {
			System.out.println("1.Dosa");
			System.out.println("2.Samosa");
			System.out.println("3.Idli");
			System.out.println("4.Vada Pav");
			System.out.println("5.Burger");
			choice = Sc.nextInt();

			switch (choice) {
			case 1:
				sum=sum+20;
			case 2:
				sum=sum+30;
			case 3:
				sum=sum+40;
			case 4:
				sum=sum+50;
			case 5:
				sum=sum+60;
			}
		}
		System.out.println("Total Bill is "+sum);
		System.out.println("Thanks for using ");
	}
}
