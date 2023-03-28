package my;

public class NumberOrders {

	public static void main(String[] args) {
		
		int number = 0;
		String str = "number:";
		
		while(number < 6) {
			str = str + " " + number;
			number = number + 2; //number = 2 +2 = 4; 4 +2 = 6
		}
		System.out.print(str + "\n"); 	
		
	}
}
