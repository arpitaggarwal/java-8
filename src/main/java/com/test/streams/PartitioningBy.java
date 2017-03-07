package com.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {

	public static void main(String[] args) {
		Map<Boolean, List<Student>> partitioningByLevel = getStudentList().stream()
				.collect(Collectors.partitioningBy(e -> e.getLevel()>101));
		System.out.println(partitioningByLevel);
	}

	private static List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("A", 101, "Intro to Web"));
		studentList.add(new Student("B", 102, "Advanced Java"));
		studentList.add(new Student("C", 101, "Intro to Cobol"));
		studentList.add(new Student("A", 101, "Intro to Web"));
		studentList.add(new Student("B", 102, "Advanced Web"));
		return studentList;
	}
}
