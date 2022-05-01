package portfolio;

import java.io.*;

public class Account { 
	
double balance;



		public Account(double startingBalance) {
			balance = startingBalance;
			
		} 
		
	public double withdraw(double withdraw) {
		
		balance = balance - withdraw;
		return withdraw;
		
		
}
	public double deposit(double deposit) {
	
		balance = balance + deposit;
		
		return deposit;
	}

	public void balance() {
		System.out.println("Hello, your current balance is " + balance );
		
	}
public static void main(String[] args) {
	 Account savings = new Account(1800);
	 
	 savings.balance();
	 savings.withdraw(900);
	 savings.balance();
	 savings.deposit(80000);
	 savings.balance();
	
	
	
}
	
	
	
	
}
