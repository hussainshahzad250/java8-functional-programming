package com.java8.features.misc;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.features.repo.Employee;

public class EmployeeManager {

	public static void main(String[] args) {
		List<Employee> employees = Stream.of(new Employee(1, 1000, "Chandra Shekhar", 6000),
				new Employee(1, 1000, "Rajesh", 8000), new Employee(1, 1004, "Rahul", 9000),
				new Employee(1, 1001, "Suresh", 12000), new Employee(1, 1004, "Satosh", 8500))
				.collect(Collectors.toList());

		int total = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("Total Employees Salary : " + total);

		System.out.println("=============================");
		total = employees.stream().collect(Collectors.summingInt(Employee::getSalary));

		int totalSalByDept = employees.stream().filter(name -> 1000 == name.getDeptId())
				.collect(Collectors.summingInt(Employee::getSalary));

		System.out.println("Total Employees Salary : " + total);
		System.out.println("Total Employees Salary for DEPT_ID 1000 : " + totalSalByDept);

		System.out.println("=============================");
		Map<Integer, List<Employee>> byDept = employees.stream().collect(Collectors.groupingBy(Employee::getDeptId));

		byDept.forEach((k, v) -> System.out.println("DeptId:" + k + "   "
				+ ((List<Employee>) v).stream().map(m -> m.getName()).collect(Collectors.joining(","))));
	}

}
