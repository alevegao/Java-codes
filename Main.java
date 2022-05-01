//Alejandro Vega
package week9assignment;

import java.util.Collections;
import java.util.Arrays;

public class Main {
	
 static void days() {
	 System.out.println("The days of the week are: ");
		String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for (String i : days) {
			System.out.println(i);
		//This prints out all the days of the week that are stored in this String Array	
    }
 }
 
 static void sorting() {
	  String xDays [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	  for (int i = 0; i < 1; i++) {
		  Arrays.sort(xDays, Collections.reverseOrder());
		 System.out.println("The 7 days of the week  in descending alphabetical order " + Arrays.toString(xDays));
		 //This method reverses the order of a normal week in descending alphabetical order by using collection.reverseorder
	  }
}	  
	  
 
 static void favorite() {
	 String yDays [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	 System.out.println("Alejandro's favorite day of the week is: " + yDays[5]);
	 //This would print out that Alejandro's favorite day is Saturday since it's in array spot number 5
 }
 
 
	public static void main(String [] args) {
			days();
			sorting();
			favorite(); 
			
		}
	}

 