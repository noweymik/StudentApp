package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create arraylist of user-defined class objects
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1); //adding Student class object
		Student s2 = new Student(102, "Choi", 21);
		al.add(s2); //adding Student class object
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Han", 20));
		al.add(new Student(105, "Lee", 22));
		al.add(new Student(106, "Lim", 27));
		al.add(new Student(107, "Kang", 24));
		al.add(new Student(108, "Ann", 23));
		al.add(new Student(109, "Jang", 24));
		al.add(new Student(110, "Shin", 21));
		al.add(new Student(111, "Bok", 26));
		
		
		Collections.sort(al);
		//Traverse elements of arraylist (ordered)
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		//Traverse elements of arraylist (reverse ordered)
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
