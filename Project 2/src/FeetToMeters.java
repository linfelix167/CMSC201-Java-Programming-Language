/**
 * Class: CMSC201 Java Programming
 * Instructor: Ashique Tanveer
 * Description: Convert feet into meters program
 * Due: 09/14/2016
 * I pledge by honor that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.

   Sign here: Ho Chien, Lin

 */
import java.util.Scanner;

public class FeetToMeters{
	public static void main(String[] args){
	double feet, meters;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a value for feet:");
	feet = input.nextDouble();
	meters = feet * 0.305;
	System.out.println(" "+feet+" feet is "+meters+" meters");
	
	}


}
