package calculate;

public class PrintOut {
	
	public static void printNumbers(double[] arr, int first, int last ){
		for (int i = first; i <= last; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void teamColors(){
		
		String [][] colors= {{"red", "blue"}, {"red", "white", "black"}, {"green", "gray"}, {"pink", "gray", "black"}};
		for (int i=0; i < colors.length; i++) {
			System.out.print("Team no. " + i + " :");
			for (int j=0; j < colors[i].length; j++ )
				System.out.print(" " + colors[i][j]);
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		double[] arr = {1.2, 4.7, 9.8, 3.3};
		
		//printNumbers(arr, 0, arr.length - 1);
		System.out.println("");
		
		teamColors();
	}

}
