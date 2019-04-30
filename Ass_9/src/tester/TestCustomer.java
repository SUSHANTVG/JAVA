package tester;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static util.ValidationRules.*;

import com.app.core.Customer;

import util.RegAmountSorter;
import util.RegDateSorter;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int ch;
		int i;

		String email, password, newPassword, date;
		double regAmount;
		LocalDate regDate;
		
		try {
			List<Customer> clist = new ArrayList<Customer>();
			Customer cs;
			
			do {
				System.out.println("1. Register\n2. Login\n3. Change Password");
				System.out.println("4. Unsubscribe\n5. Display\n6. Display customers after date");
				System.out.println("7. Sort by email\n8. Sort by reg. date\n9. Sort by reg. amount");
				System.out.println("10. Sort by reg. date and reg. amount\n11. Exit");
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
							System.out.println("Enter email:");
							email = x.next();
							checkEmailLength(email);
							System.out.println("Enter password:");
							password = x.next();
							checkPassword(password);
							i = verifyLogin(email, password, clist);
							if(i != -1)
								System.out.println("Welcome, User");
							break;
						case 3:
							System.out.println("Enter email:");
							email = x.next();
							checkEmailLength(email);
							System.out.println("Enter password:");
							password = x.next();
							checkPassword(password);
							i = verifyLogin(email, password, clist);
							if(i != -1)
								System.out.println("Welcome, User");
							System.out.println("Enter new password:");
							newPassword = x.next();
							checkPassword(newPassword);
							clist.get(i).setPassword(newPassword);
							System.out.println("Password changed.");
							break;
						case 4:
							System.out.println("Enter email:");
							email = x.next();
							checkEmailLength(email);
							System.out.println("Enter password:");
							password = x.next();
							checkPassword(password);
							i = verifyLogin(email, password, clist);
							if(i != -1)
								System.out.println("Welcome, User");
							clist.remove(i);
							System.out.println("User unsubscribed.");
							break;
						case 5:
							for(Customer cc : clist)
								System.out.println(cc);
							break;
						case 6:
							System.out.println("Enter date:");
							date = x.next();
							regDate = checkRegDate(date);
							for(Customer cc : clist) {
								if (cc.getRegDate().isAfter(regDate))
									System.out.println(cc);
							}
							break;
						case 7:
							System.out.println("Customers sorted by email:");
							Collections.sort(clist);
							break;
						case 8:
							System.out.println("Customers sorted by email:");
							Collections.sort(clist, new RegDateSorter());
							break;
						case 9:
							System.out.println("Customers sorted by email:");
							Collections.sort(clist, new RegAmountSorter());
							break;
						case 10:
							System.out.println("Customer sorted by reg. date and reg. amount");
							Collections.sort(clist,new Comparator<Customer>() {
								@Override
								public int compare(Customer obj1, Customer obj2) {
									int p = obj1.getRegDate().compareTo(obj2.getRegDate());
									if (p == 0) {
										return ((Double)obj1.getRegAmount()).compareTo(obj2.getRegAmount());
									}
									return p;
								}
							});
							break;
						case 11:
							System.exit(0);
							break;
						default:
							System.out.println("Invalid choice!");
					}
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}while(ch!=11);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(x!=null)
				x.close();
		}
	}
}
