package cust_exce;

@SuppressWarnings("serial")
public class EmailMismatchException extends Exception {
	public EmailMismatchException(String errMsg) {
		super(errMsg);
	}
}
