package calculate;

public class IndexElement {

	public static void main(String[] args) {
		int[] arr = new int[5];  //create an array
		arr[0] = 5;    //first component or element = 5
				
		arr[arr.length - 1] = 19;   // the last element
		
		for( int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
