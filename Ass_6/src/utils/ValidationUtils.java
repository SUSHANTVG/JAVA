package utils;

import cust_exce.EmailMismatchException;
import cust_exce.DeptIdMismatchException;
import cust_exce.SalaryMismatchException;

public class ValidationUtils {
	public static final int MAX_CHAR;
	public static final int MIN_CHAR;
	
	static {
		MAX_CHAR = 15;
		MIN_CHAR = 5;
	}
	
	public static void checkEmailLength(String email) throws Exception {
		if(email.length() < MIN_CHAR)
			throw new EmailMismatchException("Email too short! Minimum 5 chars.");
		if(email.length() > MAX_CHAR)
			throw new EmailMismatchException("Email too long! Maximum 10 chars.");
	}
	
	public static void checkAtChar(String email) throws Exception {
		if(!email.contains("@"))
			throw new EmailMismatchException("Email must contain '@'");
	}
	
	public static void checkDeptId(String deptId) throws Exception {
		if(!deptId.matches("Sales|HR|RND|Marketing")) throw new
			DeptIdMismatchException("Invalid Department ID!"); 
		}
	 
	
	public static void checkBasicSalary(double basic) throws Exception {
		if(basic % 1000 !=0 )
			throw new SalaryMismatchException("Salary must be in the the multiples of 1000.");
	}
}
