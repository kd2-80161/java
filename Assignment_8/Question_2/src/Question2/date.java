
package Question2;
import java.util.*;

public class date implements displayable {
 @Override
	public String toString() {
		return "date [hrs=" + hrs + ", min=" + min + ", sec=" + sec+ "]";
	}

private int hrs;
 private int min;
 private int sec;
 
 Scanner sc=new Scanner(System.in);
 public void accept() {
	 System.out.println("Enter hours: ");
	 hrs=sc.nextInt();
	 System.out.println("Enter Minutes: ");
	 min=sc.nextInt();
	 System.out.println("Enter Seconds: ");
	 sec=sc.nextInt();
 }
 
 @Override
	public void display() {
	 System.out.println("Time: "+hrs+"/"+min+"/"+sec);
		
	}
 
}
