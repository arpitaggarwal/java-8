package com.arpit.java8.streams;

public class Student {

	private final String teacher;
	private final double level;
	private final String className;

	public Student(final String teacher, final double level,
			final String className) {
		super();
		this.teacher = teacher;
		this.level = level;
		this.className = className;
	}

	public String getTeacher() {
		return teacher;
	}

	public double getLevel() {
		return level;
	}

	public String getClassName() {
		return className;
	}

	@Override
	public String toString() {
		return "Student [teacher=" + teacher + ", level=" + level
				+ ", className=" + className + "]";
	}

}
