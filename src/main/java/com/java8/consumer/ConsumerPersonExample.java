package com.java8.consumer;

import com.java8.request.Person;
import com.java8.repository.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {

	static Consumer<Person> c1 = (person) -> System.out.println(person);

	static Consumer<Person> c2 = (person) -> System.out.println(person.getName().toUpperCase());

	static Consumer<Person> c3 = (person) -> System.out.println(person.getHobbies());

	static List<Person> personList = PersonRepository.getAllPersons();

	static void printNameAndHobbies() {
		personList.forEach(c1.andThen(c2));
	}

	static void printWithCondition() {
		personList.forEach(p -> {
			if (p.getGender().equals("Male") && p.getHeight() >= 140) {
				c2.andThen(c3).accept(p);
			}
		});
	}

	public static void main(String[] args) {
		// List<Person> personList = PersonRepository.getAllPersons();
		// c1.accept(PersonRepository.getPerson());
		// c2.accept(PersonRepository.getPerson());
		// c3.accept(PersonRepository.getPerson());
		// c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson());
		printNameAndHobbies();
//		printWithCondition();

	}

}
