import java.lang.*;
import java.util.Scanner;

/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.

For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.


The program should input all these facts as integers, calculate the new balance 
(= beginning balance+ charges – credits), 

display the new balance and determine whether the new balance exceeds the customer’s credit limit.

 For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".


*/
public class Credit_Limit_Calculator {
	int account_number;
	double balance;
	int total_items;
	int total_credits;
	int credit_limit;

	public Credit_Limit_Calculator(int account_number, double balance, int total_items, int total_credits,
			int credit_limit) {
		super();
		this.account_number = account_number;
		this.balance = balance;
		this.total_items = total_items;
		this.total_credits = total_credits;
		this.credit_limit = credit_limit;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getTotal_items() {
		return total_items;
	}

	public void setTotal_items(int total_items) {
		this.total_items = total_items;
	}

	public int getTotal_credits() {
		return total_credits;
	}

	public void setTotal_credits(int total_credits) {
		this.total_credits = total_credits;
	}

	public int getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}

	public int calculateBalance() {
//		 calculate the new balance (= beginning
//		balance+ charges – credits)
		
		double new_Balance=0;
		if(credit_limit<balance) {
			System.out.println("Credit Limit Exceeded");
		}
		else {
		 new_Balance = balance + total_items - total_credits;
		}
		return (int) new_Balance;
	}

	public void display() {
		if(credit_limit<balance) {
			System.out.println("Credit Limit Exceeded");
		}
		else {
		System.out.println("The new balance is " + this.balance);
		}
	}

	public void accept() {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the account_number");
		account_number = Sc.nextInt();
		
		System.out.println("Enter the balance");
		balance = Sc.nextDouble();
		
		System.out.println("Enter the credit limit");
		credit_limit =Sc.nextInt();
		
		
	}

	public Credit_Limit_Calculator() {
//		super();
		this.account_number = 0;
		this.balance = 0;
		this.total_items = 0;
		this.total_credits = 0;
		this.credit_limit = 0;

	}
	
	public static void main(String[] args) {
		Credit_Limit_Calculator clc = new Credit_Limit_Calculator();
		clc.accept();
		clc.display();
		
	}

}
