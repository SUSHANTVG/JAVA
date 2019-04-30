package util;

import java.util.Comparator;

import com.app.core.Customer;

public class RegDateSorter implements Comparator<Customer>{
	@Override
	public int compare(Customer obj1, Customer obj2) {
		return obj1.getRegDate().compareTo(obj2.getRegDate());
	}
}
