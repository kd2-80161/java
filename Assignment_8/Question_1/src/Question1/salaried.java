package Question1;

import java.util.Scanner;

public class salaried extends emloyee {
		@Override
		public void accept() {
			System.out.println("Enter name: ");
			this.setName(new Scanner(System.in).nextLine());
			
			System.out.println("Enter Empid");
			this.empid=new Scanner(System.in).nextInt();
			
			System.out.println("Enter salary: ");
			this.sal=new Scanner(System.in).nextDouble();


		}


		@Override
		public void display() {
			System.out.println("Name: "+this.getName());
			System.out.println("Empid: "+this.empid);
			System.out.println("Salary: "+this.sal);

		}

		@Override
		public double pay() {

			return sal;
		}


		
	}

