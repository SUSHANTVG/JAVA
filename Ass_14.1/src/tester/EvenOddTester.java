package tester;

import java.util.Scanner;

import thread_util.EvenNumbers;
import thread_util.OddNumbers;

public class EvenOddTester {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int first = sc.nextInt();
		
		System.out.println("Enter last number:");
		int last = sc.nextInt();
		
		EvenNumbers t1 = new EvenNumbers(first, last, "Even");

		OddNumbers t2 = new OddNumbers(first, last, "Odd");
		
		t1.join();
		t2.join();
		
		if(sc != null)
			sc.close();

	}

}
