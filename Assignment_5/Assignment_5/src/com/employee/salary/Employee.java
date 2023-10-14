package com.employee.salary;

import java.util.Scanner;

public abstract class Employee {
    String firstName, lastName;
    int ssn;
    public abstract int  salary();

    public void accept(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the firstName");
        this.firstName = Sc.nextLine();
        System.out.println("Enter the lastName");
        this.lastName = Sc.nextLine();
        System.out.println("Enter the ssn number");
        this.ssn = Sc.nextInt();
    }
}
