/**
 * 
 */
package Question2;

import java.util.Scanner;


public class person1 implements displayable {
	@Override
	public String toString() {
		return "person [name=" + name + "]";
	}

	public String name;

	public void accept() {
		System.out.println("Enter Name");
		Scanner sc = new Scanner(System.in);
		this.setName(sc.nextLine());
	}

	public void display() {
		System.out.println("Name: " + getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
