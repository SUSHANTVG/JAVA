package tester;

import java.util.List;
import java.util.Scanner;
import static collection_utils.CollectionUtils.*;
import com.app.core.Emp;

import thread_utils.SortHireDare;
import thread_utils.SortSalary;

public class TestEmp {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		List<Emp> l1 = populateList();
		
		System.out.println("Enter dept name(RnD/Prod/Sales) to sort by salary:");
		String dept1 = sc.next();
		
		System.out.println("Enter dept name(RnD/Prod/Sales) to sort by hire date:");
		String dept2 = sc.next();
		
		Thread t1 = new Thread(new SortSalary(l1, dept1));
		Thread t2 = new Thread(new SortHireDare(l1, dept2));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		if(sc!=null)
			sc.close();
	}

}
