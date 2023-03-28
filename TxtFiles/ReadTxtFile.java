package TxtFiles;

import java.io.*;

public class ReadTxtFile {

	public static void main(String[] args) throws IOException {
		File filename = new File("C:\\Users\\Administrator\\Desktop\\input\\persons.txt");

		BufferedReader instream = new BufferedReader(new FileReader(filename));
		PrintWriter outstream = new PrintWriter(new BufferedWriter(new FileWriter("myfile.txt")));
		//Ex1 start
		  String data = null; 
		  while ((data = instream.readLine()) !=null) {
		  System.out.println(data); 
		  }
		  
		 //End of Ex1
		//Ex2
	/*	while (true) {
			String raw1 = instream.readLine();
			if (raw1 == null) //we reach the end of the file
				break;
			String raw2 = instream.readLine();
			int age = Integer.parseInt(raw2);
			if (age >= 20)
				System.out.println(raw1 + " " + age);
		}*/
	
	}
}
