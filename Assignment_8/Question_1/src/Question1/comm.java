/**
 * 
 */
package Question1;

import java.util.Scanner;

public class comm extends emloyee {
	double comm;

	@Override
	public void accept() {
		System.out.println("Enter name: ");
		this.name = new Scanner(System.in).nextLine();

		System.out.println("Enter Salary");
		this.sal = new Scanner(System.in).nextDouble();

		System.out.println("Enter Comm: ");
		this.comm = new Scanner(System.in).nextDouble();

	}

	@Override
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("SSN: " + this.sal);
		System.out.println("Salary: " + this.pay());

	}

	@Override
	public double pay() {
		return sal + comm;
	}

}
