package com.invoice.entity;
public class Invoice {
	String part_number;
	String part_desc;
	int item_quantity;
	double item_price;

	public Invoice() {
//		super();
	}
	

	public Invoice(String part_number, String part_desc, int item_quantity, double item_price) {
//		super();
		this.part_number = part_number;
		this.part_desc = part_desc;
		this.item_quantity = item_quantity;
		this.item_price = item_price;
	}

	

	public String getPart_number() {
		return part_number;
	}


	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}


	public String getPart_desc() {
		return part_desc;
	}


	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}


	public int getItem_quantity() {
		if(item_quantity<0)
			return 0;
		return item_quantity;
	}


	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}


	public double getItem_price() {
		if(item_price<0)
			return 0.0;
		return item_price;
	}


	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
