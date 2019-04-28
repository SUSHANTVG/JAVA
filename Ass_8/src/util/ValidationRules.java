package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.app.core.Customer;

import cust_excs.CustomerHandlingException;;

public class ValidationRules {
	public static final int MAX_CHAR;
	public static final int MIN_CHAR;
	public static DateTimeFormatter dtf;
	public static LocalDate year;

	static {
		MAX_CHAR = 15;
		MIN_CHAR = 5;
		dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
		year = LocalDate.of(LocalDate.now().getYear(), 3, 31);
	}

	public static void checkEmailLength(String email) throws CustomerHandlingException {
		if (email.length() < MIN_CHAR)
			throw new CustomerHandlingException("Email too short! Minimum 5 chars.");
		if (email.length() > MAX_CHAR)
			throw new CustomerHandlingException("Email too long! Maximum 10 chars.");
		if(!email.contains("@"))
			throw new CustomerHandlingException("Email must contain '@'");
	}
	
	public static void checkPassword(String password) throws CustomerHandlingException {
		if(!password.matches("[a-z]+[@,%,#,&,*][0-9]+"))
			throw new CustomerHandlingException("Password must contain alphanumericals and only one character.");
	}
	
	public static void checkRegAmount(double regAmount) throws CustomerHandlingException {
		if(regAmount%500 != 0)
			throw new CustomerHandlingException("Registration amount must be in multiples of 500");
	}
	
	public static LocalDate checkRegDate(String regDate) throws CustomerHandlingException {
		LocalDate ld = LocalDate.parse(regDate, dtf);
		if(ld.isAfter(year))
			throw new CustomerHandlingException("Invalid date.");
		return ld;
	}

	public static boolean checkDuplicateEmail(String email, ArrayList<Customer> cs) throws CustomerHandlingException {
		if(cs.contains(new Customer(email)))
			throw new CustomerHandlingException("Email already exists!");
		else
			return false;
	}
}