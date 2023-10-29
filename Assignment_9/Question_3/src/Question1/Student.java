/**
 * 
 */
package Question1;

import java.util.*;


class Stu{
	private int roll;
	private String name;
	private String city;
	private double marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Stu(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stu [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	
}
public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu[] arr=new  Stu[5];
		
		arr[0]=new Stu(1,"Ujjwal","Lucknow",100);
		arr[1]=new Stu(2,"Vijay","Patna",95);
		arr[2]=new Stu(3,"Sumit","Lucknow",90);
		arr[3]=new Stu(4,"Princy","Lucknow",100);
		arr[4]=new Stu(5,"Sarthak","Gonda",100);
	
		class order implements Comparator<Stu>{
			@Override
			public int compare(Stu a, Stu b) {
				int diff=-(a.getCity().compareTo(b.getCity()));
				if(diff==0) {
					diff= -1*((int)(a.getMarks()-b.getMarks()));
				}
				if(diff==0)
				diff=a.getName().compareTo(b.getName());
				
				return diff;
			}
		}
		
		order ord = new order();
		Arrays.sort(arr,ord);
		for(Stu S:arr) {
			System.out.println(S.toString());
		}

	}

}