package cust_exce;

@SuppressWarnings("serial")
public class SalaryMismatchException extends Exception {
	public SalaryMismatchException(String errMsg) {
		super(errMsg);
	}
}
