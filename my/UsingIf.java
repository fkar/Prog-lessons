package my;

import java.util.Scanner;

public class UsingIf {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("What is your age? ");
		
		int ticketPrice;
		int age = in.nextInt();
/*		boolean cheap;
		
		if( age < 2 ){
			ticketPrice = 0;
			cheap = true;
		}else if (age < 12) {
			ticketPrice = 5000;
			cheap = true;
			System.out.println("Welcome to our flight.");
		}
		else if (age < 65) { 
			ticketPrice = 6000;
			cheap = false;
		} else {
		ticketPrice = 7000;
		cheap = false;
		}
		System.out.println("Ticket price for " + age + " years is: " + ticketPrice + " Dinar " + "Is ist cheap? " + cheap);
*/	
		//String str = "The color is red";
	switch(age) {
	case (2):
		ticketPrice = 0;
		System.out.println("For the chiled who is 2 years old will not pay anything.");
		break;
	case (30):
		ticketPrice = 3000;
		System.out.println("Ticket price for " + age + " years is: " + ticketPrice + " Dinar ");
		break;
	case (60):
		ticketPrice = 5000;
		System.out.println("Ticket price for " + age + " years is: " + ticketPrice + " Dinar ");
		break;
	case (70):
		ticketPrice = 1000;
		System.out.println("Ticket price for " + age + " years is: " + ticketPrice + " Dinar ");
		break;
		default:
			System.out.println("There is no existing age!");	
	}
	}
}
