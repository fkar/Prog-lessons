package my;

import java.util.Scanner;

public class UsingRepeateFor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Number of rows: ");
		
		String str = in.nextLine();
		int n = Integer.parseInt(str);
		
		String text = "";
		for (int i=1; i <= n; i++) { //i = i +1
			for (int j=1; j <= i; j++)
				text = text + '*';
			text = text + '\n';
		}
		System.out.println(text);
	}
}
