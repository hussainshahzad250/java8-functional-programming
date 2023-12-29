package com.java8.logical;

public class CalculatorImpl {

    public static void main(String[] args) {


//         com.java8.features.logical.Calculator calculator = () -> System.out.println("Switch On");
//         calculator.switchOn();
//
//         com.java8.features.logical.Calculator calculator = (message) -> System.out.println("Message : " + message);
//         calculator.print("Hello world");

		Calculator calculator = (i1,i2) -> {
			return (i1+i2);
		};
		System.out.println(calculator.sum(10, 20));


//        com.java8.features.logical.Calculator calculator = (i1, i2) -> {
//            if (i2 < i1) {
//                throw new RuntimeException("message");
//            } else {
//                return i2 - i1;
//            }
//        };
//        System.out.println(calculator.substract(8, 20));
    }

}
