package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Emp extends Dept implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private double salary;
	private String city;
	private LocalDate hireDate;
	
	public Emp(String name, int age, double salary, String city, LocalDate hireDate, String deptName) {
		super(deptName);
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", salary=" + salary + ", city=" + city + ", hireDate=" + hireDate
				+ "]";
	}
	
}
