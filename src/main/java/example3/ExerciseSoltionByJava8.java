package example3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import example3.ExerciseSoltionByJava7.Condition;

public class ExerciseSoltionByJava8 {

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
		Collections.sort(people,(p1,p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		//step2: create a method that prints all elements in the list
		System.out.println("Print all after sort......");
		printConditionalList(people, p->true);
		
		//step3: Create a method that prints all people that have name beginning with t
		printConditionalList(people, p->p.getLastName().startsWith("M"));
		printConditionalList(people, p->p.getLastName().startsWith("f"));
			
				

	}

	private static void printConditionalList(List<Person> people, Condition condition) {
		for (Person p: people) {
			if(condition.test(p)) {
				System.out.println("conditions object="+p);
			}
		}
		
	}

	
	
}


