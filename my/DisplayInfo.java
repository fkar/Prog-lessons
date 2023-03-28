package my;

import java.util.Scanner;

/** This class for display contact info
 *  just for name and age
 * @author Nina date:2023-03-05
 *
 */

public class DisplayInfo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String s1 = "She has a house";
		String s2 = "in UK";
		String s3 = s1 + " " + s2;
		String name = in.nextLine();
		System.out.println("My name is: " + name);
		System.out.println("Enter your age: ");  
        String age = in.nextLine(); 
        System.out.println("My age is: " + age);  
        char b = '?';
        System.out.println("My char is: " + b);
        System.out.println("s3: " + s3);
        in.close();
	}
}
