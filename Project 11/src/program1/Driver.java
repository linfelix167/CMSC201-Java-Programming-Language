package program1;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Project 11
 * Due: 11/17/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien Lin
   */

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Which object do you want to create:"
				+ "(1.Student/2.Faculty/3.Staff)");
		String num = in.nextLine();
		
		if(num.equalsIgnoreCase("1")){
		
			String studentName, studentAddress, studentPhone, studentEmail, studentStatus;
		
			System.out.print("Enter student's name: ");
			studentName = in.nextLine();
			System.out.print("Enter student's address: ");
			studentAddress = in.nextLine();
			System.out.print("Enter student's phone: ");
			studentPhone = in.nextLine();
			System.out.print("Enter student's email: ");
			studentEmail = in.nextLine();
			System.out.print("Enter student's status: ");
			studentStatus = in.nextLine();
		
			Student obj = new Student(studentName, studentAddress, studentPhone, studentEmail, studentStatus);
			System.out.println(obj.toString());
		}
		else if(num.equalsIgnoreCase("2")){
			
			String name, address, phone, email;
			int officeNum, salary; 
			String hired; 
			String officeHour, rank;
			System.out.print("Enter faculty's name: ");
			name = in.nextLine();
			System.out.print("Enter faculty's address: ");
			address = in.nextLine();
			System.out.print("Enter faculty's phone: ");
			phone = in.nextLine();
			System.out.print("Enter faculty's email: ");
			email = in.nextLine();
			System.out.println("Enter office number: ");
			officeNum = in.nextInt();
			System.out.print("Enter salary: ");
			salary = in.nextInt();
			in.nextLine();
			System.out.print("Enter hired date: ");
			hired = in.nextLine();
			MyDate date = new MyDate(hired);
			System.out.print("Enter office hours: ");
			officeHour = in.nextLine();
			System.out.print("Enter rank: ");
			rank = in.nextLine();
			
			Faculty obj2 = new Faculty(name, address, phone, email, officeNum, salary, date, officeHour, rank); 
			System.out.println(obj2.toString());
		}
		else if(num.equalsIgnoreCase("3")){
			
			String name, address, phone, email;
			int officeNum, salary; 
			String hired; 
			String title;
			
			System.out.print("Enter staff's name: ");
			name = in.nextLine();
			System.out.print("Enter staff's address: ");
			address = in.nextLine();
			System.out.print("Enter staff's phone: ");
			phone = in.nextLine();
			System.out.print("Enter staff's email: ");
			email = in.nextLine();
			System.out.print("Enter office number: ");
			officeNum = in.nextInt();
			System.out.print("Enter salary: ");
			salary = in.nextInt();
			System.out.print("Enter hired date: ");
			hired = in.nextLine();
			MyDate date = new MyDate(hired);
			in.nextLine();
			System.out.print("Enter title: ");
			title = in.nextLine();
			
			Staff obj3 = new Staff(name, address, phone, email, officeNum, salary, date, title);
			System.out.println(obj3.toString());
		}

	}

}
