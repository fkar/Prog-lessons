package obj;

public class PersonInfo {

	public static void main(String[] args) {
		
		Person p1 = new Person("David", "Jefferson", 48, true);

		
		String str = p1.getFirstname() + " " + p1.getSurname() + ", age year " + p1.getAge() + " is ";
		
		if (!p1.isSingel())
			str = str + " not ";
			str = str + " singel";
			
			System.out.println(str);

	}

}
