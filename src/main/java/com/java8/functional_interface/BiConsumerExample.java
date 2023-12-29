package com.java8.functional_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String, Integer> {

    public static void main(String[] args) {

        BiConsumer<String, Integer> biConsumer = new BiConsumerExample();
        biConsumer.accept("Vishal", 53000);

        BiConsumer<String, Integer> biConsumer1 = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String i1, Integer i2) {
                System.out.println(i1 + ":" + i2);
            }
        };
        biConsumer1.accept("Welcome", 143);

        BiConsumer<String, Integer> biConsumer2 = (i1, i2) -> System.out.println("key:" + i1 + " value:" + i2);
        biConsumer2.accept("YouTube", 786);

        Map<String, Integer> map = new HashMap<>();
        map.put("Vishal", 5000);
        map.put("Sandeep", 15000);
        map.put("Arun", 12000);
        map.forEach((k, v) -> System.out.println(k + "," + v));
    }

    @Override
    public void accept(String i1, Integer i2) {
        System.out.println("Input 1 " + i1 + ": Input 2 " + i2);
    }
}
