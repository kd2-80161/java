/**
 * 
 */
package com.sunbeam;

import java.util.*;


public class Tester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList = new ArrayList<Book>();
		int index = 0;
		Book b, key;
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while (choice != 0) {
			System.out.println("------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new book in list");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index`");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");
			switch (choice) {
			case 1:
				b = new Book();
				b.acceptBook();
				System.out.println(bookList.indexOf(b));
				if (bookList.contains(b)) {
					System.out.println("hello");
					int x = bookList.indexOf(b);
					int q = bookList.get(x).getQty() + b.getQty();
					bookList.get(x).setQty(q);
				}

				else {
					bookList.add(b);
				}
				break;
			case 2:
				for(int i=0;i<bookList.size();i++) {
					System.out.println(bookList.get(i));
				}
				break;
			case 3:
				System.out.println("Enter isbn for searching = ");
				String isbn = sc.next();
				key = new Book();
				key.setIsbn(isbn);
				int ind = bookList.indexOf(key);
				if (ind == -1) {
					System.out.println("Not Found");

				} else
					System.out.println(bookList.get(ind));
				break;

			case 4:
				System.out.println("Enter index for deletion of book = ");
				index = sc.nextInt();
				if (index < 0 && index > bookList.size()) {
					System.out.println("Wrong Index...:(");
		
				} else {
					bookList.remove(index);
					System.out.println("Book at given index deleted");
				}
				break;

			case 5:
				System.out.println("Enter isbn to Delete = ");
				isbn = sc.next();
				key = new Book();
				key.setIsbn(isbn);
				ind = bookList.indexOf(key);
				if (ind == -1) {
					System.out.println("NOT FOUND");
				} else {
					bookList.remove(ind);
				}

				break;

			case 6:

				Collections.reverse(bookList);
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;

			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our Book App :)");

	}

}
