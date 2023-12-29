package com.java8.streams;

import java.util.Optional;

import com.java8.request.Person;
import com.java8.repository.PersonRepository;

public class StreamReduceExample1 {

	public static void main(String[] args) {
		combineNames();
		Optional<Person> tallestPerson = getTallestPerson();
		System.out.println("Tallest Person is :" + tallestPerson.get());
	}

	private static void combineNames() {
		String names = PersonRepository.getAllPersons().stream().map(Person::getName).reduce("", (a, b) -> a.concat(b));
		System.out.println("Names are :" + names);
	}

	static Optional<Person> getTallestPerson() {
		return PersonRepository.getAllPersons().stream().reduce((x, y) -> x.getHeight() > y.getHeight() ? x : y);
	}

}
