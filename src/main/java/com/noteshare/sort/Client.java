package com.noteshare.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class Client {

	@Test
	public void sort() {
		// 利用TreeSet的方式
		TreeSet<Student> tree = new TreeSet<Student>();
		tree.add(new Student("noteshare", 26));
		tree.add(new Student("noteshare", 5));
		tree.add(new Student("Aomnus", 20));
		for (Student data : tree) {
			System.out.println(data.getName() + "|" + data.getAge());
		}
	}

	@Test
	public void sort2() {
		// 利用Collections.sort对List排序
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("noteshare", 26));
		list.add(new Student("noteshare", 5));
		list.add(new Student("Aomnus", 20));

		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.compareTo(o2);
			}
		});

		for (Student data : list) {
			System.out.println(data.getName() + "|" + data.getAge());
		}
	}

}

class Student implements Comparable<Student> {

	private int age;

	private String name;

	@Override
	public int compareTo(Student o) {
		if (!this.name.equalsIgnoreCase(o.name)) {
			return this.name.compareTo(o.name);
		} else {
			return this.age - o.age;
		}
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
