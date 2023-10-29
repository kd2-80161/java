
package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class Book {
	String isbn;
	double price;
	String authorName;
	int qty;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", qty=" + qty + "]";
	}

	public void acceptBook() {
		System.out.println("Enter isbn: ");
		setIsbn(new Scanner(System.in).next());
		System.out.println("Enter Author: ");
		setAuthorName(new Scanner(System.in).next());
		System.out.println("Enter Price: ");
		setPrice(new Scanner(System.in).nextDouble());
		System.out.println("Enter qty: ");
		setQty(new Scanner(System.in).nextInt());

	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Book other = (Book) obj;
		if (other.getIsbn().equals(this.isbn))
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList = new ArrayList<Book>();
		int index = 0;
		Book b, key;
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		final String file = "Books.bin";
		while (choice != 0) {
			System.out.println("------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new book in list");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index`");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list");
			System.out.println("7. Save Book in file");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");
			switch (choice) {
			case 1:
				b = new Book();
				b.acceptBook();
//				System.out.println(bookList.indexOf(b));

				if (bookList.contains(b)) {

					int x = bookList.indexOf(b);
					int q = bookList.get(x).getQty() + b.getQty();
					bookList.get(x).setQty(q);
				}

				else {
					bookList.add(b);
				}
				break;
			case 2:
				for (int i = 0; i < bookList.size(); i++) {
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
			case 7:
				// Save books in ﬁle
				try (FileOutputStream fout = new FileOutputStream(file);
						DataOutputStream dout = new DataOutputStream(fout)) {
					for (Book e : bookList) {
						dout.writeUTF(e.getIsbn());
						dout.writeDouble(e.getPrice());
						dout.writeUTF(e.authorName);
						dout.writeInt(e.qty);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("Movies Saved");
				break;
			case 8:
//				 load books from ﬁle. Use DataOutputStream
//                and DataInputStream.
				try (FileInputStream fin = new FileInputStream(file); DataInputStream din = new DataInputStream(fin)) {
					while (true) {
						Book m = new Book();
						m.setIsbn(din.readUTF());
						m.setPrice(din.readDouble());
						m.setAuthorName(din.readUTF());
						m.setQty(din.readInt());
						System.out.println(m);
					}

				} catch (EOFException e) {

				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
	}

}