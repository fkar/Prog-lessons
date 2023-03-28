package my;

import java.util.Scanner;

public class MultRows {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");

		String str = in.nextLine();
		int number = Integer.parseInt(str);
		String text = "";
		
		for ( int i=1; i <= number; i++) {
			for (int j=1; j<= i; j++)
				text = text + (i * j) + " "; //row * column
			text = text + '\n';
		}
		System.out.println(text);
	}

}
