/**

 * 
 */

package Question1;
import java.util.*;

import Question2.displayable;

/**
 * @author Ujjwal
 *
 */
public class person implements displayable{
	
	public String name;
	
	public void accept() {
		System.out.println("Enter Name");
		Scanner sc=new Scanner(System.in);
		this.setName(sc.nextLine());
	}
	
	public void display() {
		System.out.println("Name: "+getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

