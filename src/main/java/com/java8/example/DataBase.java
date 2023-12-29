package com.java8.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 600000));
        list.add(new Employee(388, "Vikas", "IT", 900000));
        list.add(new Employee(470, "Vishal", "DEFENCE", 500000));
        list.add(new Employee(624, "Sandeep", "CORE", 400000));
        list.add(new Employee(176, "Prakash", "SOCIAL", 1200000));
        return list;
    }

}
