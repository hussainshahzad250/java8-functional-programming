package com.java8.features.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.features.repo.Department;

public class Java8_ListToMap {

	public static void main(String[] args) {
		List<Department> deptList = new ArrayList<>();
		deptList.add(new Department(1, "IT"));
		deptList.add(new Department(2, "HR"));
		deptList.add(new Department(3, "Management"));
		deptList.add(new Department(4, "Development"));
		deptList.add(new Department(5, "Recruitment"));
		Map<Integer, String> deptMap = deptList.stream()
				.collect(Collectors.toMap(Department::getDeptId, Department::getDeptName));

		deptMap.forEach((k, v) -> System.out.println("DeptId (" + k + ") Name :" + v));
	}

}