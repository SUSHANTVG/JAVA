package util;

import java.util.Comparator;

import com.app.core.Customer;

public class RegAmountSorter implements Comparator<Customer>{
	@Override
	public int compare(Customer obj1, Customer obj2) {
		return ((Double)obj1.getRegAmount()).compareTo(obj2.getRegAmount());
	}
}
