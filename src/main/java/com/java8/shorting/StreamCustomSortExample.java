package com.java8.shorting;

import java.util.Comparator;

import com.java8.request.Person;
import com.java8.repository.PersonRepository;

public class StreamCustomSortExample {

	public static void main(String[] args) {
		System.out.println("Sort By Name");
		PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getName))
				.forEach(System.out::println);

		System.out.println("Sort By Height");
		PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getHeight))
				.forEach(System.out::println);

		System.out.println("Reverse Sort By Name");
		PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getName).reversed())
				.forEach(System.out::println);
	}

}
