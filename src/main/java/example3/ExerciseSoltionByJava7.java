package example3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseSoltionByJava7 {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				new Person("prasad", "Meduri", 38),
				new Person("one", "five", 4),
				new Person("two", "four", 6),
				new Person("three", "three", 45),
				new Person("four", "two", 22),
				new Person("five", "one", 11)
				
				);
		
		
		//step1: sort list by last name
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			 
		});
		//step2: create a method that prints all elements in the list
		
		printAll(people);
		
		//step3: Create a method that prints all people that have name beginning with t
		printConditionalList(people, new Condition(){

			public boolean test(Person p) {
				return p.getLastName().startsWith("M");
			}
			
			
		});
			
				

	}

	private static void printConditionalList(List<Person> people, Condition condition) {
		for (Person p: people) {
			if(condition.test(p)) {
				System.out.println("conditions object="+p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for (Person p: people) {
			System.out.println(p);
		}
		
	}

	interface Condition {
		boolean test(Person p);
	}
}


