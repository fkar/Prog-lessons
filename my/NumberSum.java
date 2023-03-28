package my;

import java.util.Scanner;

//exercise: calculate the sum of 1 + 2 + 3 + 4 +..+ n
public class NumberSum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("n? ");
		while(true){
			String num = in.nextLine();
			if (num == null){
				break;   //the user clicked cancel
			}
			
			int n = Integer.parseInt(num);
			
			int sum = 0;
			int k = 1;
			while(k <= n){
				sum = sum + k;  //sum = 0 + 1 = 1
				k = k +1 ; // k= 1 + 1 = 2;
			}
			System.out.println("The sum of numbers is: " + sum);
		} //end of the outer while statement
		System.exit(0); // when I pressed cancel(break)
	}
}
