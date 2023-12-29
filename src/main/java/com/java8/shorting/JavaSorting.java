package com.java8.shorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.request.User;

public class JavaSorting {

	public static void main(String[] args) {

		Arrays.asList(10, 23, 4, 0, 18).stream().sorted().forEach(System.out::println);
		Arrays.asList("A", "B", "C", "D").stream().sorted().forEach(System.out::println);

		List<Integer> list = Arrays.asList(10, 23, 4, 0, 18);

		System.out.println("Integer sorting in ascending order");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("Integer sorting in decending order");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		List<String> list2 = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
		
		System.out.println("String sorting in ascending order");
		list2.stream().sorted().forEach(System.out::println);

		System.out.println("String sorting in decending order");
		list2.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		// Object shorting
		List<User> userList = Arrays.asList(new User("John", 33), new User("Robert", 26), new User("Mark", 26),
				new User("Brandon", 42));

		System.out.println("Object sorting by age in ascending order");
		userList.stream().sorted(Comparator.comparingInt(User::getAge)).forEach(System.out::println);

		System.out.println("Object sorting by name in ascending order");
		userList.stream().sorted(Comparator.comparing(User::getName)).forEach(System.out::println);

		System.out.println("Object sorting by age in decending order");
		userList.stream().sorted(Comparator.comparingInt(User::getAge).reversed()).forEach(System.out::println);

	}
}
