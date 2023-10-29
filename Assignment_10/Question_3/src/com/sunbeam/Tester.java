/**
 * 
 */
package com.sunbeam;

import java.util.*;


public class Tester {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> EmployeeList = new LinkedList<Employee>();
		int index = 0;
		Employee b, key;
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while (choice != 0) {
			System.out.println("------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new Employee in list");
			System.out.println("2. Delete a Employee at given Empid");
			System.out.println("3. Find a Employee with given Empid");
			System.out.println("4. Sort Employee");
			System.out.println("5. Edit Employee");

			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");
			switch (choice) {
			case 1:
				b = new Employee();
				b.acceptEmployee();
				EmployeeList.add(b);
				break;
			case 2:
				System.out.println("Enter index for deletion of Employee = ");
				index = sc.nextInt();
				if (index < 0 && index > EmployeeList.size()) {
					System.out.println("Wrong Index...:(");

				} else {
					EmployeeList.remove(index);
					System.out.println("Employee at given index deleted");
				}
				break;
			case 3:
				System.out.println("Enter isbn for searching = ");
				int empid = sc.nextInt();
				key = new Employee();
				key.setEmpid(empid);
				int ind = EmployeeList.indexOf(key);
				if (ind == -1) {
					System.out.println("Not Found");

				} else
					System.out.println(EmployeeList.get(ind));
				break;
			case 4:
				class Arrsort implements Comparator<Employee> {
					@Override
					public int compare(Employee a, Employee b) {
						int diff = Integer.compare(a.getEmpid(), b.getEmpid());

						return diff;
					}
				}
				Arrsort booksort = new Arrsort();
				EmployeeList.sort(booksort);
				System.out.println("Sorted Book List");
				for (Employee e : EmployeeList) {
					System.out.println(e);
				}
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				key = new Employee();
				key.setEmpid(id);
				index = EmployeeList.indexOf(key);
				if (index == -1)
					System.out.println("Employee not found.");
				else {
					Employee oldEmp = EmployeeList.get(index);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.acceptEmployee();
					EmployeeList.set(index, newEmp);
				}
			case 6: {
				for (Employee employee : EmployeeList) {
					System.out.println(employee);
				}
			}
			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}

		}
		System.out.println("Thank you for using our Employee App :)");

	}

}
