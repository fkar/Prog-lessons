package obj;

public abstract class Operations {
	
	private int age;
	private String name;
	
	public static int addValues(int a, int b){
		return a + b;
	}
	public static String addValues(String str1, String str2){

		return str1 + str2;
	}

	public abstract int add(int a, int b);

	@Override
	public String toString() {
		return String.format("Operations [age=%s, name=%s]", age, name);
	}
	
	

	public static void main(String[] args) {
		
		int num1 = 19;
		int num2 = 333;
		
		int sum = addValues(num1, num2);
		
		System.out.println("Sum of numbers = " + sum);
		
		String s1 = "Hi";
		String s2 = " Ann";
		
		System.out.println("Sum of strings = " + addValues(s1, s2)  );

	}

}
