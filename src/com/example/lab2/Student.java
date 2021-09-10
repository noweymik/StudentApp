package com.example.lab2;

public class Student implements Comparable<Student> {
	int no; //number
	String name; //name
	int age; //age
	public Student(int i, String string, int j) {
		this.no = i;
		this.name = string;
		this.age = j;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
}
