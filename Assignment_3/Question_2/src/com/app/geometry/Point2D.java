package com.app.geometry;
import java.util.Scanner;

public class Point2D {
	double x;
	double y;
	Scanner Sc = new Scanner(System.in);

	public Point2D() {
		x = 0;
		y = 0;
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void getDetails() {
		System.out.println(this.x + " , " + this.y);
	}

	public boolean isEqual(Point2D P2) {
		
		return this.x == P2.x 
				&& 
				this.y == P2.y;

	}

	public void accept() {
		System.out.println("Enter coordinates for the first point (x y):");
		this.x = Sc.nextDouble();
		this.y = Sc.nextDouble();
	}

	public double calculateDistance(Point2D P2) {
		
		double dx = this.x - P2.x;
		double dy = this.y - P2.y;

		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

}