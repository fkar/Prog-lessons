package obj;

import java.util.LinkedList;

public class PersonLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Person> lp = new LinkedList<>();
		lp.add(new Person("Julia", "Ritchard", 29, true));
		lp.add(new Person("Noori", "Larson", 18, false));
		lp.add(new Person("Mick", "Perton", 56, true));
		lp.add(new Person("Lo", "Anderson", 79, true));
		
		System.out.println("The list is " + lp);
		
		System.out.println("\n");
		
		Person p1 = new Person("Mia", "Duran", 34, false);
		lp.add(p1);
		
		lp.addLast(new Person("Henry", "Danial", 67, true));
		lp.removeFirst();
		lp.removeLast();
		
		System.out.println("The first person is: " + lp.getFirst());
		System.out.println("Person first name is:" + p1.getFirstname() + "\n");
		
		System.out.println("The first person is: " + lp.contains(p1));
		System.out.println("The first person is: " + lp.getLast());
		for(Person p: lp){
		System.out.println(p);
		}
		
		LinkedList<Person> stack = new LinkedList<Person>();
		stack.addFirst(new Person("Gorge", "Adolfson", 80, true));
		stack.addLast(new Person("Kanon", "Do", 74, false));
		
		System.out.println();
		
		for(int i = 0; i < stack.size(); i++){
			System.out.println(stack.get(i));
		}
	}

}
