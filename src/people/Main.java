package people;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		Person Pete = new Person("Pete", 21, "Game enthusiast");
		Person Jamie = new Person("Jamie", 22, "Potato Peeler");
		Person Sam = new Person("Sam", 24, "Professional Catlicker");
		List<Person> people = new ArrayList<Person>();
		people.add(Pete);
		people.add(Jamie);
		people.add(Sam);
		
		for(Person person: people) {
			System.out.println(person);
		}
		
		System.out.println(findPerson(people, "Pete"));
		
	}
	
	public static List<Person> findPerson(List<Person> personlist, String name){
		return personlist.stream()
		.filter(person -> name.equals(person.getName()))
		.collect(Collectors.toList());
	}

}
