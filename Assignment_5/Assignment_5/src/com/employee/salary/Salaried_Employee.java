package com.employee.salary;

import java.util.Scanner;

public class Salaried_Employee extends Employee{
    int weeklySalary;

    @Override
    public void accept() {
            super.accept();
        System.out.println("Enter the weeklySalary");
        this.weeklySalary = new Scanner(System.in).nextInt();
    }

    @Override
    public int salary() {
    return weeklySalary;
    }
}
