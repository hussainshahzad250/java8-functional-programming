package com.java8.optional;

import com.java8.request.Customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) throws Exception {

        Customer customer = new Customer(101, "john", "test@gmail.com", Arrays.asList("397937955", "21654725"));

        //empty
        //of
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Optional<String> emailOptional = Optional.of(customer.getEmail());
        //System.out.println(emailOptional);

//        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
       /* if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }*/
        // System.out.println(emailOptional2.orElse("default@email.com"));

        // System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("email not present")));


//        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email..."));

    }
}
