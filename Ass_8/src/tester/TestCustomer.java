package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import static util.ValidationRules.*;

import com.app.core.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int ch;

		String email, password, date;
		double regAmount;
		LocalDate regDate;
		
		try {
			ArrayList<Customer> clist = new ArrayList<>();
			Customer cs;
			
			do {
				System.out.println("1. Register\n2. Display\n3. Exit");
				System.out.println("Enter your choice:");
				ch = x.nextInt();
				
				try {
					switch (ch) {
						case 1:
							System.out.println("Enter email:");
							email = x.next();
							checkEmailLength(email);
							checkDuplicateEmail(email, clist);
							System.out.println("Enter password:");
							password = x.next();
							checkPassword(password);
							System.out.println("Enter registration amount:");
							regAmount = x.nextDouble();
							checkRegAmount(regAmount);
							System.out.println("Enter registration date:");
							date = x.next();
							regDate = checkRegDate(date);
							cs = new Customer(email, password, regAmount, regDate);
							clist.add(cs);
							System.out.println("Registered successfully!");
							break;
						case 2:
							for(Customer cc : clist)
								System.out.println(cc);
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.out.println("Invalid choice!");
					}
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}while(ch!=3);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(x!=null)
				x.close();
		}
	}
}
