import java.util.Scanner;

/*
Q3. Create an application that calculates your daily driving cost, so that you can estimate 
how much
money could be saved by car pooling, 
which also has other advantages such as reducing carbon
emissions and reducing traffic congestion.

 The application should input the following information
and display the user’s cost per day of driving to work:

a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.*/


public class Daily_Cost {
	
		int total_miles;
	
	double cost_per_gallon;
	int avg_miles;
	int parking_fees;
	int tolls_per_day;
	
	 void accept() {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println(" Total miles driven per day."
				+ "\n Cost per gallon of gasoline.\n"
				+ " Average miles per gallon.\n"
				+ " Parking fees per day.\n"
				+ " Tolls per day.");
		        this.total_miles = Sc.nextInt();
				this.cost_per_gallon = Sc.nextDouble();
				this.avg_miles = Sc.nextInt();
				this.parking_fees = Sc.nextInt();
				this.tolls_per_day = Sc.nextInt();
				
	}
	 void  display() {
		System.out.println("The user’s cost per day of driving to work:");
		
		 double gallonsUsed = total_miles / avg_miles;
		 
	        double costPerDay = (gallonsUsed * cost_per_gallon) + parking_fees + tolls_per_day;

	        // Display the result
	        System.out.println("Your daily driving cost is: " + costPerDay);

	}
	
	public static void main(String[] args) {
		Daily_Cost dc = new Daily_Cost();
		dc.accept();
		dc.display();
	}
	
}
