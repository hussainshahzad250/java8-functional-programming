package com.java8.misc;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.request.Person;
import com.java8.repository.PersonRepository;

public class PersonManager {

	public static void main(String[] args) {
		List<Person> employees = PersonRepository.getAllPersons();

		Double collect = employees.stream().filter(o -> o.getSalary() > 10000)
				.collect(Collectors.summingDouble(Person::getSalary));
		double sum = employees.stream().filter(o -> o.getSalary() > 10000).mapToDouble(o -> o.getSalary())
				.summaryStatistics().getSum();
		double sum1 = employees.stream().filter(o -> o.getSalary() > 10000).mapToDouble(o -> o.getSalary()).sum();

		System.out.println(collect + "\n" + sum + "\n" + sum1);
	}
}
