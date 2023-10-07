package pkg1;

public class Ques_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 5;
		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < space; k++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
		System.out.println("\n\n\n");

		space = 5;
		for (int i = 0; i < 9; i =i+2) {

			for (int k = 1; k < space; k++)
				System.out.print(" ");

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
		}
		
		space = 1;
		for (int i = 9 - 2; i >= 0; i = i - 2) {

			for (int k = 0; k < space; k++)
				System.out.print(" ");

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			space++;
		}

		System.out.println("\n\n\n");

		space = 6;
		 for (int i = 1; i <= space; i=i+2) {
	            // Print spaces
	            for (int j = 1; j <= space - i; j++) {
	                System.out.print(" ");
	            }

	            // Print asterisks
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();


	}

	}
}
