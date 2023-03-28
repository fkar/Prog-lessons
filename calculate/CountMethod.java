package calculate;

import java.util.Scanner;

public class CountMethod {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

/*		System.out.print("Input first number: ");

		String str1 = in.nextLine();
		double num1 = Double.parseDouble(str1);
		System.out.print("Input second number: ");
		String str2 = in.nextLine();
		double num2 = Double.parseDouble(str2);
		
		double result = MeanValue.meanval(num1, num2);
		
		System.out.print("Mean value is: " + result + '\n');*/
		
		System.out.print("How much is the radius: ");
		String rad = in.nextLine();
		
		double radius = Double.parseDouble(rad);
		double sphereArea = Area.countArea(radius);
		System.out.println("The sphere area = " + sphereArea);
	}

}

class MeanValue {

	public static double meanval(double number1, double number2) {
		return (number1 + number2) / 2;
}
}

class Area {

	public static double countArea(double r) {
	 
		double area = 4 * Math.PI * r * r;
		return area;
	}
}
