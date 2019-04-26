package testworker;

import workers.*;
import java.util.*;
import static utils.ValidationUtils.*;

public class TestOrg {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		int ch, counter = 0, eId;
		
		boolean flag = false;
		
		String name, email, deptId;
		double basic, perfBonus, hrlyRate, netSalary;
		int  hrsWorked;
		
		System.out.println("How many workers:");
		Emp[] e = new Emp[x.nextInt()];
		
		do {
			System.out.println("1. Hire Manager");
			System.out.println("2. Hire Worker");
			System.out.println("3. Display");
			System.out.println("4. Display details of specific employee");
			System.out.println("5. Fire employee");
			System.out.println("6. Salary increment");
			System.out.println("7. Exit");
			System.out.println("Enter your choice:");
			ch = x.nextInt();
			
			switch (ch) {
				case 2:
					if(counter < e.length) {
						try {
							System.out.println("Enter name:");
							name = x.next();
							System.out.println("Enter email:");
							email = x.next();
							checkEmailLength(email);
							checkAtChar(email);
							System.out.println("Enter deptId:");
							deptId = x.next();
							checkDeptId(deptId);
							System.out.println("Enter basic salary:");
							basic = x.nextDouble();
							checkBasicSalary(basic);
							System.out.println("Enter hours worked:");
							hrsWorked = x.nextInt();
							System.out.println("Enter hourly rate:");
							hrlyRate = x.nextDouble();
							e[counter++] = new Worker(name, email, basic, deptId, hrsWorked, hrlyRate);
						} catch (Exception ex) {
							System.out.println(ex.getMessage());
						}
					} else {
						System.out.println("No Vacancy");
					}
					break;
					
				case 1:
					if(counter < e.length) {
						try {
							System.out.println("Enter name:");
							name = x.next();
							System.out.println("Enter email:");
							email = x.next();
							checkEmailLength(email);
							checkAtChar(email);
							System.out.println("Enter deptId:");
							deptId = x.next();
							checkDeptId(deptId);
							System.out.println("Enter basic salary:");
							basic = x.nextDouble();
							checkBasicSalary(basic);
							System.out.println("Enter performance bonus:");
							perfBonus = x.nextInt();
							e[counter++] = new Mgr(name, email, basic, deptId, perfBonus);
						} catch (Exception ex) {
							System.out.println(ex.getMessage());
						}
					} else {
						System.out.println("No Vacancy");
					}
					break;
					
				case 3:
					for (int i=0;i<counter;i++) {
						if(e[i] != null) {
							System.out.println(e[i]);
							netSalary = e[i].calNetSalary();
							System.out.println("Net Salary: " + netSalary);
						}
					}
					break;
					
				case 4:
					System.out.println("Enter employee id to show details:");
					eId = x.nextInt();
					for(int i=0;i<counter;i++) {
						if(eId == e[i].getId()) {
							flag = true;
							break;
						} else {
							flag = false;
						}
					}
					if(flag == true) {
							System.out.println(e[eId-100]);
					}
					else
						System.out.println("Record not found!");
					break;
					
				case 5:
					System.out.println("Enter employee id:");
					eId = x.nextInt();
					for(int i=0;i<counter;i++) {
						if(eId == e[i].getId()) {
							flag = true;
							break;
						} else {
							flag = false;
						}
					}
					if(flag == true) {
						System.out.println(e[eId-100].toString()+" got fired!");
						e[eId-100] = null;
					} else
						System.out.println("Record not found!");
					break;
					
				case 6:
					System.out.println("Enter employee id:");
					eId = x.nextInt();
					for(int i=0;i<counter;i++) {
						if(eId == e[i].getId()) {
							flag = true;
							break;
						} else {
							flag = false;
						}
					}
					if(flag == true) {
						System.out.println("Enter incremented basic salary:");
						basic = x.nextInt();
						e[eId-100].setBasic(basic);
						System.out.println(e[eId-100].toString());
						netSalary = e[eId-100].calNetSalary();
						System.out.println("Net Salary: " + netSalary);
					} else
						System.out.println("Record not found!");
					break;
					
				case 7:
					System.exit(0);
					
				default:
					System.out.println("Invalid choice!");
			}
		}while(ch!=7);
		
		if(x != null)
			x.close();
	}

}
