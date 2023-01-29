package com.java8.features.readjson;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
}
