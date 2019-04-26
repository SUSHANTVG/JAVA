package tester;

import java.util.Scanner;

import com.app.core.Emp;

import stack.FixedStack;
import stack.GrowingStack;
import stack.Stack;

public class TestStack {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Stack ref = null;
		int ch;
		do {
			System.out.println("1. Fixed Stack\n2. Growing Stack\n"
					+ "3. Push\n4. Pop\n5. Exit");
			System.out.println("Enter your choice:");
			ch = x.nextInt();
			switch (ch) {
				case 1:
					if (ref == null)
						ref = new FixedStack();
					else
						System.out.println("Stack is chosen!");
					break;
				case 2: 
					if (ref == null)
						ref = new GrowingStack();
					else
						System.out.println("Stack is chosen!");
					break;
				case 3:
					if (ref != null) {
						System.out.println("Enter employee details - id, name");
						Emp e = new Emp(x.nextInt(), x.next());
						ref.push(e);
					} else
						System.out.println("You haven't chosen stack!");
					break;
				case 4:
					if (ref != null)
						System.out.println(ref.pop());
					else
						System.out.println("You haven't chosen stack!!!!");
					break;
				case 5:
					System.exit(0);
					break;
			}
		}while(ch!=5);
		
		if (x != null)
			x.close();
	}

}
