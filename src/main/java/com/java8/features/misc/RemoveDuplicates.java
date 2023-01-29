package com.java8.features.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.java8.features.repo.Department;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Department> deptList = new ArrayList<>();
		deptList.add(new Department(1, "IT"));
		deptList.add(new Department(2, "HR"));
		deptList.add(new Department(1, "IT"));
		deptList.add(new Department(4, "Development"));
		deptList.add(new Department(2, "HR"));

		Set<String> deptSet = new HashSet<>();

		// directly removing the elements from list if already existed in set
		deptList.removeIf(p -> !deptSet.add(p.getDeptName()));

		deptList.forEach(dept -> System.out.println(dept.getDeptId() + " : " + dept.getDeptName()));

	}
}