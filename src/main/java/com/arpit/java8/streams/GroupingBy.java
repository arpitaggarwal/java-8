package com.arpit.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		Map<String, List<Student>> groupByTeachers = getStudentList().stream()
				.collect(Collectors.groupingBy(Student::getTeacher));
		System.out.println(groupByTeachers);
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

