package com.java8.features.repo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private String block;
	private String city;
	private String state;
	private String country;
	int pincode;
}
