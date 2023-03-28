package my;

public class TypesOfText {

	public static void main(String[] args) {
		
		String color1= "Red";
		String color2= "Red";
		
		String s1 = "Hello";  //index of Hello: H = 0, e=1, l=2, l=3, o=4
		String s2 = "Lw";
		
		System.out.println("The color is: " + color1 + "\n" + "The String length is: "+ color1.length());
		System.out.println("The char at position is: " + color1.charAt(1) + "\n");
		
		//System.out.println("Are the colors equals? " + color1.equals(color2) );
		//System.out.println("Are the colors equals? " + color1.equalsIgnoreCase(color2) );
		//System.out.println("Start with method:  " + s1.startsWith(s2) + "\n" );
		//System.out.println("LastIndexOf method:  " + s1.lastIndexOf("H") + "\n");
		
		String str = "  WeAther is very nice";
		String subStr = str.substring(4);
		System.out.println("Substring is: " + subStr + "\n");
		String subWord = str.substring(1, 3);
		System.out.println("Substring is: " + subWord + "\n");
		System.out.println("Replace is: " + str.replace('e', 'i') );
		
	    String strTrim = str.trim(); 
	    System.out.println("Trim is:" + strTrim  + "\n");  
	    System.out.println("CompareTo: " + color1.compareTo(color2) );
		
		System.out.println("To lower case: " + str.toLowerCase() + "\n");
		System.out.println("To lower case: " + str.toUpperCase() );

		int str1 = 2;
		System.out.println("Value of String: " + String.valueOf(2.0));
	}

}
