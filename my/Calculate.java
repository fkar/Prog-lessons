package my;

import java.util.Scanner;

public class Calculate{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a year? "); 
		
		int year = in.nextInt();  //2023
		
		if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
			System.out.print("Leap year"); 
		}else {
			System.out.print("It's not a leap year."); 
		}

	}

}
