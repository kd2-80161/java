package com.app.tester;
import com.app.geometry.*;
import java.util.*;

public class TestPoint {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		p1.accept();
		p2.accept();
		
		System.out.println("Points are ");
		p1.getDetails();
		p2.getDetails();
		
		if(p1.isEqual(p2)){
			System.out.println("P1 and P2 are located at same position");
		}
		else {
			System.out.println("Distance is "+p1.calculateDistance(p2));
		}
	}
}