package cust_exce;

@SuppressWarnings("serial")
public class DeptIdMismatchException extends Exception {
	public DeptIdMismatchException(String errMsg) {
		super(errMsg);
	}
}
