package com.tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.cdac.core.*;

class TestStudents {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yyyy");
		int counter = 0;
		int ch;
		Student[] s = new Student[3];
		
		do {
			System.out.println("1. Add Student\n2. Display\n3. Avg GPA of students who opted JAVA");
			System.out.println("4. Display students with age > 23");
			System.out.println("5. Sort students by DOB\n6. Exit");
			System.out.println("Enter your choice:");
			ch = x.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Student's RollNo, Email, GPA, Subject, DOB:");
				s[counter++] = new Student(x.nextInt(), x.next(), x.nextDouble(), x.next(), x.next());
				break;
				
			case 2:
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				System.out.println("Using for loop:");
				for (int i = 0; i < counter; i++)
					System.out.println(s[i]);
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				System.out.println("Using JAVA8 for each loop:");
				Arrays.stream(s).filter(ss -> ss!=null).forEach(i -> System.out.println(i));
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				break;
				
			case 3:
				double avg = Arrays.stream(s).filter(ss -> ss!=null)
					.filter(ss -> ss.getSubject().equals("JAVA"))
					.mapToDouble(ss -> ss.getGpa()).average().orElse(-1);
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				System.out.println("Avg GPA of students who opted JAVA: "+avg);
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				break;
				
			case 4:
				LocalDate today = LocalDate.now();
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				System.out.println("Students with age > 23:");
				Arrays.stream(s).filter(ss -> ss!=null)
					.filter(ss -> LocalDate.parse(ss.getDob(), dtf).until(today).getYears() > 23)
					.forEach(i -> System.out.println(i));
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				break;
				
			case 5:
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				System.out.println("Students sorted by DOB:");
				Arrays.stream(s).filter(ss -> ss != null)
					.sorted((s1, s2) -> LocalDate.parse(s1.getDob(),dtf).compareTo(LocalDate.parse(s2.getDob(),dtf)))
					.forEach(i -> System.out.println(i));
				System.out.println("-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----x-----");
				break;
				
			case 6:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice!");
			}
		} while (ch!=6);
		

		if(x!=null)
			x.close();
	}
}