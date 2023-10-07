package com.invoice.test;

import java.util.Scanner;

import com.invoice.entity.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice = new Invoice();

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the price");
		int price = Sc.nextInt();
		invoice.setItem_price(price);
		System.out.println("Enter the quantity");
		int quantity = Sc.nextInt();
		Sc.nextLine();
		invoice.setItem_quantity(quantity);
		
		System.out.println("Enter the part number");
		String pnumber = Sc.nextLine();
		invoice.setPart_number(pnumber);
		System.out.println("Enter the part description");
		String pdesc = Sc.nextLine();
		invoice.setPart_desc(pdesc);

		System.out.println("Total Price is " + invoice.getItem_price() * invoice.getItem_quantity());

	}

}
