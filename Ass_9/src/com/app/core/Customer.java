package com.app.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	
	private int id; private static int idCounter; 
	private String email;
	private String password;
	private double regAmount;
	private LocalDate regDate;
	private static final int offset;
	
	static { 
		offset = 100; 
		idCounter = offset; 
	}

	public Customer(String email, String password, double regAmount, LocalDate regDate) {
		id = idCounter++;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}

	public Customer(String email) {
		this.email = email;
	}
	
	public Customer(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", regAmount=" + regAmount + ", regDate=" + regDate + "]";
	}

	@Override
	public boolean equals(Object e) {
		if(e instanceof Customer)
			return email.equals(((Customer) e).email);
		return false;
	}

	@Override
	public int compareTo(Customer cs) {
		int c = ((String)email).compareTo(((Customer) cs).getEmail());
		return c;
	}
}
