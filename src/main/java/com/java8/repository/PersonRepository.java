package com.java8.repository;

import com.java8.request.Address;
import com.java8.request.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

	public static List<Person> getAllPersons() {
		Person p1 = new Person("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"),null);
		Person p2 = new Person("Angel", 158, 5000, "Female", 2, Arrays.asList("Driving", "Music", "Football"),null);
		Person p3 = new Person("Dean", 140, 5700, "Male", 2, Arrays.asList("Cricket", "Driving", "Tennis"),null);
		Person p4 = new Person("Nancy", 130, 4900, "Female", 2, Arrays.asList("Cricket", "Swimming", "Tennis"),null);
		Person p5 = new Person("Harper", 125, 9000, "Female", 2, Arrays.asList("Football", "Swimming", "Tennis"),null);
		Person p6 = new Person("Alan", 110, 9500, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"),null);
		Person p7 = new Person("Campell", 165, 1548, "Male", 1, Arrays.asList("Swimming", "Tennis"),null);

		return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
	}

	public static Person getPerson() {
		return new Person("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"),null);
	}
	
	public static Optional<Person> getPersonOptional() {
		Person per = getPerson();
		per.setAddress(Optional.of(new Address("7 th Block", "Ashburn", "Virginia", "USA", 20047)));
		return Optional.of(per);
	}

}
