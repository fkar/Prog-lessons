package obj;

public class Person {

	private String firstname;
	private String surname;
	private int age;
	private boolean singel = true;
	
	public Person() {
	}
	
	public Person(String fname, String lastname, int age, boolean singel){
		this.firstname = fname;
		this.surname = lastname;
		this.age = age;
		this.singel = singel;
	}
		
	//instance methods
	
/*	public void setFirst(String fname){
		if (fname != null)
			firstname = fname;
		else
			throw new NullPointerException();		
	}*/

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSingel() {
		return singel;
	}

	public void setSingel(boolean singel) {
		this.singel = singel;
	}
	

	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", surname=" + surname + ", age=" + age + ", singel=" + singel + "]";
	}
}
