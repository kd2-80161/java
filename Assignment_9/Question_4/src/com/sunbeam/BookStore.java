import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "ISBN: " + isbn + ", Price: " + price + ", Author: " + authorName + ", Quantity: " + quantity;
	}
}

public class BookStore {
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		int choice;
		do {
			System.out.println("\nLibrary Management Menu:");
			System.out.println("1. Add a new book");
			System.out.println("2. Display all books");
			System.out.println("3. Delete a book at a specific index");
			System.out.println("4. Check if a book with a given ISBN exists");
			System.out.println("5. Delete all books");
			System.out.println("6. Display the number of books");
			System.out.println("7. Sort all books by price in descending order");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addBook(library);
				break;
			case 2:
				displayBooks(library);
				break;
			case 3:
				deleteBook(library);
				break;
			case 4:
				checkBookByISBN(library);
				break;
			case 5:
				deleteAllBooks(library);
				break;
			case 6:
				displayNumberOfBooks(library);
				break;
			case 7:
				sortBooksByPriceDescending(library);
				break;
			case 8:
				System.out.println("Exiting the program. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
		} while (choice != 8);

		scanner.close();
	}

	private static void addBook(ArrayList<Book> library) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter ISBN: ");
		String isbn = scanner.next();
		System.out.print("Enter price: $");
		double price = scanner.nextDouble();
		System.out.print("Enter author's name: ");
		String authorName = scanner.next();
		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();

		Book newBook = new Book(isbn, price, authorName, quantity);
		
		library.add(newBook);
		System.out.println("Book added successfully.");
	}

	private static void displayBooks(ArrayList<Book> library) {
		for (int i = 0; i < library.size(); i++) {
			System.out.println("Book " + (i + 1) + ": " + library.get(i));
		}
	}

	private static void deleteBook(ArrayList<Book> library) {
		System.out.print("Enter the index of the book to delete: ");
		int index = new Scanner(System.in).nextInt();

		if (index >= 0 && index < library.size()) {
			library.remove(index);
			System.out.println("Book at index " + index + " has been deleted.");
		} else {
			System.out.println("Invalid index. No book deleted.");
		}
	}

	private static void checkBookByISBN(ArrayList<Book> library) {
		System.out.print("Enter the ISBN to check: ");
		String isbn = new Scanner(System.in).next();

		for (Book book : library) {
			if (book.getIsbn().equals(isbn)) {
				System.out.println("Book with ISBN " + isbn + " exists in the library.");
				return;
			}
		}

		System.out.println("Book with ISBN " + isbn + " does not exist in the library.");
	}

	private static void deleteAllBooks(ArrayList<Book> library) {
		library.clear();
		System.out.println("All books have been deleted.");
	}

	private static void displayNumberOfBooks(ArrayList<Book> library) {
		System.out.println("Number of books in the library: " + library.size());
	}

	private static void sortBooksByPriceDescending(ArrayList<Book> library) {
		Collections.sort(library, Comparator.comparing(Book::getPrice).reversed());
		System.out.println("Books have been sorted by price in descending order.");
	}
}
