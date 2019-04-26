package com.tester;

import java.util.*;
import com.cdac.core.*;

class TestStudents {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Student[] s = new Student[2];
		for(int i=0;i<2;i++) {
			System.out.println("Enter Name, Email, Age");
			s[i] = new Student(x.next(), x.next(), x.nextInt());
			System.out.println("Enter scores for quiz, test & assignments:");
			s[i].getScore(x.nextInt(), x.nextInt(), x.nextInt());
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.printf("ID\tName\tEmail\tAge\tGPA\n");
		System.out.println("-----------------------------------------------------");
		for(Student s1: s)
			System.out.println(s1.getDetails());
		System.out.println("-----------------------------------------------------");
	}
}