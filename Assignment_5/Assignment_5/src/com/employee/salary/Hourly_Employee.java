package com.employee.salary;

import java.util.Scanner;

public class Hourly_Employee extends Employee {
    int wage;
    int hours;

    @Override
    public void accept() {
        Scanner Sc = new Scanner(System.in);
        super.accept();
        System.out.println("Enter wage");
        this.wage = Sc.nextInt();
        System.out.println("Enter hours");
        this.hours = Sc.nextInt();
    }

    @Override
    public int salary() {
        int salary;
        if (this.hours <= 40)
            salary = this.wage * this.hours;
        else {
            salary = (int)(40 * this.wage + (this.hours - 40) * this.wage * 1.5);
        }
    return salary;
    }
}
