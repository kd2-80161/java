package com.employee.tester;
import com.employee.salary.BasePlus_Commission_Employee;

public class Main {
    public static void main(String[] args) {
        BasePlus_Commission_Employee basePlusCommissionEmployee = new BasePlus_Commission_Employee();
        basePlusCommissionEmployee.accept();
        System.out.println("Salary is "+basePlusCommissionEmployee.salary());
    }
}