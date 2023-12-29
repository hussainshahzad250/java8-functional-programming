package com.java8.terminal_streams;

import java.util.stream.Collectors;

import com.java8.request.Person;
import com.java8.repository.PersonRepository;

public class StreamJoiningExample {

	static String joiningExample() {
		String s = PersonRepository.getAllPersons().stream().map(Person::getName)
				// .collect(Collectors.joining());
				// .collect(Collectors.joining("-"));
				.collect(Collectors.joining("-", "[", "]"));
		return s;
	}

	public static void main(String[] args) {
//		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
//		String join = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining("-", "[", "]"));
//		 System.out.println("Joined Data :"+join);
		System.out.println("Joining Output :" + joiningExample());
	}

}
