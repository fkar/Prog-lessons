package obj;

import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> films = new ArrayList<>();
		
		films.add("Kriminal");    		//index = 0
		films.add("Cartoon film");		//index = 1
		films.add("Action");			//index = 2
		films.add("Comedy");			//index = 3
		
		for (int i= 0; i < films.size(); i++){
			System.out.println("Films catogory is: " + films.get(i));
		}
		System.out.println();
		
		for(String element : films)
			System.out.println(element);
		
		//films.clear();
		System.out.println();
		System.out.println("The new list" + "\n");
		
		films.remove(3);
		for(String element : films)
			System.out.println(element);
		
		/*for(String element : films.subList(1, 3))
			System.out.println(element);*/
	}

}
