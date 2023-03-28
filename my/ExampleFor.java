package my;

import java.util.Scanner;

//Find the first space in text.
public class ExampleFor {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Write a text?");
	
	String text = in.nextLine();
	
	int counter;
	for (counter = 0; counter < text.length(); counter = counter +1)
		if(text.charAt(counter) == ' ' ||  text.charAt(counter) == '\t')
			break;
		if (counter < text.length())
			System.out.println("First white space found in place number: " + counter);
		else
			System.out.println("There is no space found.");
	}
}
