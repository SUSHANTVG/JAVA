package tester;

import java.util.Scanner;

import thread_utils.EvenNumbers;
import thread_utils.OddNumbers;

public class EvenOddTester {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int first = sc.nextInt();
		
		System.out.println("Enter last number:");
		int last = sc.nextInt();
		
		Thread t1 = new Thread(new EvenNumbers(first, last), "Even");
		Thread t2 = new Thread(new OddNumbers(first, last), "Odd");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		if(sc != null)
			sc.close();

	}

}
