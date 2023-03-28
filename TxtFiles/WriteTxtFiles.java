package TxtFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTxtFiles {

	public static void main(String[] args) throws IOException {
		String str = "The planet erath is round." + '\n' + "There are a lot of houses and streets builds in this erath." + '\n' + "there are rivers and oceans too.";
		
		try{
			//attach myfile to FileWriter
			FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\input\\myfile.txt");
			//read every character from String str and write it into FileWriter
			for (int j = 0; j < str.length(); j++)
				fw.write(str.charAt(j));
			System.out.println("Written into a file finished.");
			
			//close the file
			fw.close();
		}catch (Exception ex){
			ex.getStackTrace();
		}

	}

}
