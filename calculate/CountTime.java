package calculate;

import java.util.Calendar;

public class CountTime {

	
	public static void showTime() {
	
		String str = Calendar.getInstance().getTime().toString();
		
		int time = str.indexOf(':');

		System.out.println("Calnder of all fields:  " + Calendar.getInstance().getTime()  + '\n');
		System.out.println("time index: " + str.indexOf(':') + '\n');
		System.out.println("The time is: " + str.substring(time-2, time+6));
		
	}
	
	public static int countChars(String str, char c){
		int no = 0;
		for (int i= 0; i < str.length(); i++) {
			if ( str.charAt(i) == c)
				no++;
		}
		return no;
	}
	
	public static void main(String[] args) {
		//showTime();	
		System.out.print("the numbers of chars are: " + countChars("My home is clean eveeery day", 'y'));
	}

}
