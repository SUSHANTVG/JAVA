package com.cdac.core;

public class Student {
	private int id;
	private String dob, email, subject;
	private double gpa;
	
	public Student(int id, String email, double gpa, String subject, String dob) {
		this.id = id;
		this.dob = dob;
		this.email = email;
		this.subject = subject;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", dob=" + dob + ", email=" + email + ", subject=" + subject + ", gpa=" + gpa
				+ "]";
	}

	public String getDob() {
		return dob;
	}

	public double getGpa() {
		return gpa;
	}

	public String getSubject() {
		return subject;
	}

}