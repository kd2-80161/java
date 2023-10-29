/**
 * 
 */
package com.sunbeam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserMain {

	/**
	 * @param args
	 * @throws ParseException 
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int choice = 1;
		while (choice != 0) {
			System.out.println("--------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new User");
			System.out.println("2. Delete given User");
			System.out.println("3. Update User");
			System.out.println("4. Display all Users");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("--------------------------------------");
			switch (choice) {
			case 1: {
				User c = new User();
				System.out.println("Enter Details of Users");
				System.out.println("Enter First Name");
				c.setFname(new Scanner(System.in).next());
				System.out.println("Enter Last name");
				c.setLname (new Scanner(System.in).next());
				System.out.println("Enter Email");
				c.setEmail (new Scanner(System.in).next());
				System.out.println("Enter Password");
				c.setPasswd (new Scanner(System.in).next());
				System.out.println("Enter DOB");
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date udate;
				try {
					udate = sdf.parse(new Scanner(System.in).next());
					c.setDob(udate);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try (UserDao dao = new UserDao()) {
					int cnt = dao.addUser(c);
					System.out.println("Rows Affected " + cnt);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
				break;
			case 2: {
				System.out.println("Enter Id of User");
				int id = new Scanner(System.in).nextInt();
				try (UserDao dao = new UserDao()) {
					int cnt = dao.deleteById(id);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
				break;
			case 3: {
				User c = new User();
				System.out.println("Enter Details of Users");
				System.out.println("Enter Id");

				c.setId(new Scanner(System.in).nextInt());
				System.out.println("Enter First_Name");
				c.setFname(new Scanner(System.in).next());
				System.out.println("Enter Last_Name");
				c.setLname(new Scanner(System.in).next());
				System.out.println("Enter Email");
				c.setEmail(new Scanner(System.in).next());
				System.out.println("Enter Password");
				c.setPasswd(new Scanner(System.in).next());
				System.out.println("Enter Date");
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date udate;
				try {
					udate = sdf.parse(new Scanner(System.in).next());
					c.setDob(udate);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try (UserDao dao = new UserDao()) {
					int cnt = dao.modifyUser(c);
					System.out.println("Rows Affected " + cnt);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			break;
			case 4:{
				
				try{
					UserDao dao=new UserDao();
					List<User> list=new ArrayList<User>();
					list=dao.displayAll();
					list.forEach(m->System.out.println(m));
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			break;
			default:System.out.println("Wrong choice......");
			break;
			}
		}

	}

}
