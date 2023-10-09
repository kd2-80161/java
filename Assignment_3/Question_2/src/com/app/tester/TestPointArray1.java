package com.app.tester;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static void main(String[] args) {
		System.out.println("Enter how points you want to plot");

		java.util.Scanner Sc = new java.util.Scanner(System.in);

		int number_of_points = Sc.nextInt();

		Point2D[] points = new Point2D[number_of_points];

//		System.out.println(number_of_points);

		for (int i = 0; i < points.length; i++) {

//			System.out.println("Enter value for point " + i);
//			System.out.println("Enter the value of X and Y");
//			int x = Sc.nextInt();
//			int y = Sc.nextInt();
//
//			/*
//			 * Point2D obj = points[i]; obj= new Point2D(x,y); this is not possible because
//			 * x y is not taken from user and we are trying to point to that object using
//			 * object
//			 */
//			points[i] = new Point2D(x, y);
			
			
			points[i] = new Point2D();
//			giving memory to the refernce otherwise its pointing to null as default
			points[i].accept();

		}

		int choice = -1;
		do {
			System.out.println("1. Display details of a specific point");
//			User i/p : index
//			O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
			System.out.println("2) Display x, y co-ordinates of all points");
//			Hint : for-each
			System.out.println("3) User i/p : 2 indices for the points , validate the indices");

			System.out.println("4) Exit");
			choice = Sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the index to search");
				int i = Sc.nextInt();
				if (i >= 0 && i < points.length) {
					points[i].getDetails();
				}
				break;
			case 2:
				for (Point2D point2d : points) {
					point2d.getDetails();
				}
				break;
			case 3:
				/*
				 * eg : sop("Enter index of strt point n end point"); validation : boundary
				 * condition (0<=index<length-1) isEqual -- false --compute distance --display
				 * it.
				 */

				System.out.println("Enter index of starting point and ending point");
				System.out.println("Enter the first index");
				int i1 = Sc.nextInt();
				System.out.println("Enter the second index");
				int j = Sc.nextInt();

				if ((i1 >= 0 && i1 < points.length) && (j >= 0 && j < points.length)) {
					
					if (!points[i1].isEqual(points[j])) {
						
						double distance = points[i1].calculateDistance(points[j]);

						System.out.println(distance);
					}
					else
						System.out.println("Ponts are Equal");

				}
				break;

			}
		} while (choice != 4);
	}
}