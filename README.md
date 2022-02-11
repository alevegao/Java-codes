# Java-codes

import java.util.Scanner;

//needed for input to work


public class Main {
	  
	static void arithmeticOps() {
		System.out.println("Start of arithmetic operators");
		Scanner nac = new Scanner(System.in);
		System.out.println("Type a number");
		int a = nac.nextInt();
		System.out.println("Type a decimal in");
		double b = nac.nextDouble();
		System.out.println("The result of the first number minus the second number is " + (a - b));
		System.out.println("Type a number");
		int c = nac.nextInt();
		System.out.println("Type a number");
		int d = nac.nextInt();
		System.out.println("The product of the third and fourth number is " + c * d);
		
	 }  
	
	static void comparisonOps() {
		System.out.println("Start of comparison operators");
		try (Scanner nc = new Scanner(System.in)) {
			int numbers = 7;
			System.out.println("Type number 7 twice so that 7 equals 7");
			numbers = nc.nextInt();
			switch (numbers) {
			case 7: 
				System.out.println("7 is equal to 7");
				break;
			
		default: 
			System.out.println("You did not type in the number 7");
			break; 
			 
		}
		}
		
	}

	static void logicalOps() {
		System.out.println("Start of logical operators");
		Scanner noc = new Scanner(System.in);
		System.out.println("Type in two different numbers");
		int x = noc.nextInt();
		int y = noc.nextInt(); 
		System.out.println(x > 5 || y > 10);
	}
	
	static void unaryOps() {
		System.out.println("Start of unary operators");
		System.out.println("Type in any number");
		Scanner nc = new Scanner(System.in);
		int x = nc.nextInt();
		while (x < 5) {
			System.out.println(x);
			x++;
		}
		
	}
	public static void main(String[] args) {
		arithmeticOps();
		logicalOps(); 
		unaryOps();
		comparisonOps();
		
		
	} 

}
