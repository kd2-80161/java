package com.employee.salary;

import java.util.Scanner;

public class BasePlus_Commission_Employee extends Commission_Employee{
    int baseSalary;

    @Override
    public void accept() {
        super.accept();
        System.out.println("Enter the baseSalary");
        this.baseSalary = new Scanner(System.in).nextInt();
    }

    @Override
    public int salary() {
        return super.salary() +this.baseSalary;
    }
}
