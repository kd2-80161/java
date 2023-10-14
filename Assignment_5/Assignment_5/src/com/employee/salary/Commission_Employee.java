package com.employee.salary;

import java.util.Scanner;

public class Commission_Employee extends Employee{
    int gross_sales;
    double commissionRate;

    @Override
    public int salary() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter commission Rate and Gross Sales");
        commissionRate = Sc.nextDouble();
        gross_sales = Sc.nextInt();
        return (int)this.commissionRate*this.gross_sales;
    }
}
