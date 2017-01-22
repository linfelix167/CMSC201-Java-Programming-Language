/**
 * Class: CMSC201 Java Programming
 * Instructor: Ashique Tanveer
 * Description: Payroll Program
 * Due: 09/14/2016
 * I pledge by honor that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.

   Sign here: Ho Chien, Lin
*/

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name:");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked in a week:");
		int hours = input.nextInt();
		System.out.println("Enter hourly pay rate:");
		double rate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double fTax = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double sTax = input.nextDouble();
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + rate * hours);
		System.out.println("Deduction:");
		
		double fedWithhold = (rate*hours)*(fTax);
		System.out.println("\tFederal Withholding ("+fTax*100+"%): $"+fedWithhold);
		double stateWithhold = (rate*hours)*(sTax);
		System.out.println("\tState Withholding ("+sTax*100+"%): $"+stateWithhold);
		double deduction = fedWithhold + stateWithhold;
		System.out.println("\tTotal Deduction: $"+ deduction);
		double netPay = (rate*hours) - deduction;
		System.out.println("Net Pay: $"+netPay);
		
	}
}

