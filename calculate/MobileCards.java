package calculate;

import java.util.Scanner;

public class MobileCards {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many types of cash cards? ");
		String s = in.nextLine();
		
		int n = Integer.parseInt(s);
		String[] name = new String[n];			//field for name
		double[] price = new double[n];			//field for price
		
		//read card name and card price
		for (int i=0; i<n; i++){
			System.out.println("Name for card number " + (i + 1) + "?");
			name[i] = in.nextLine();
			System.out.println("price/min for " + name[i] + "?");
			String str = in.nextLine();
			price[i] = Double.parseDouble(str);
		}
		//Count the lowest price
		int cheapest = 0;
		for ( int i = 1; i<n; i++)
			if(price[i] < price[cheapest])
				cheapest = i;   //new lowest price find
		System.out.print(name[cheapest] + " is chepest.\n" + "Price is: " + price[cheapest] + " Dinar / minut");
		}
}
