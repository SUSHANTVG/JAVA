package com.cdac.core;

public class Student {
	private int id;
	private static int idCount = 0;
	private String name, email;
	private int age;
	private double gpa;
	private int qMarks = 0, tMarks = 0, aMarks = 0;
	
	public Student(String name, String email, int age) {
		id = ++idCount;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public void getScore(int qMarks, int tMarks, int aMarks) {
		this.qMarks = qMarks;
		this.tMarks = tMarks;
		this.aMarks = aMarks;
		computeGPA(qMarks, tMarks, aMarks);
	}
	
	public double computeGPA(int qMarks, int tMarks, int aMarks) {
		double marks1 = qMarks + qMarks * 0.20;
		double marks2 = tMarks + tMarks * 0.50;
		double marks3 = aMarks + aMarks * 0.30;
		gpa = marks1 + marks2 + marks3;
		return gpa;
	}
	
	public String getDetails() {
		return ""+id+"\t"+name+"\t"+email+"\t"+age+"\t"+gpa+"";
	}
}