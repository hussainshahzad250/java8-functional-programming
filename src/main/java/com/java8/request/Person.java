package com.java8.request;

import java.util.List;
import java.util.Optional;

import com.java8.request.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private String name;
	private int height;
	private double salary;
	private String gender;
	private int kids;
	List<String> hobbies;
	Optional<Address> address;

}
