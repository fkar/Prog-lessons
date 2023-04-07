package obj;

public class CountMin {
	
	//We have a collection of numbers and we sill sort it after the minimum value.
	
	public static void sortNumbers(double[] numbers, int start, int last){
		
		for(int n=start; n < last; n++){
			//search the minimum which exists nr n until finish
			int minValue = searchMin(numbers, n, last);
			changecomponent(numbers, n, last);	
		}
	}

	private static void changecomponent(double[] numbers, int start, int last) {
		double temp = numbers[start];
		numbers[start]= numbers[last];
		numbers[last]= temp; 	
	}

	private static int searchMin(double[] numbers, int first, int last) {
		int num = first;          //index for the minimum value
		for(int i = first; i <= last; i++)
			if(numbers[i] < numbers[num])
				num = i;
		
		return num;
	}

	public static void main(String[] args) {
		
		double[] numbers = {4.5, 2.3, 6.0, 1.33};
		sortNumbers(numbers, 0, numbers.length -1);
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
	}

}
