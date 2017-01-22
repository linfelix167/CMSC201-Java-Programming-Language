import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Palindrome program
 * Due: 09/22/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/

public class Palindrome {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer:");
		number = input.nextInt();
		
		int first, last;
		first = number / 100;
		last = number %10;
		if(first == last){
			System.out.println(number+ " is a palindrome");
		}
		else{
			System.out.println(number+" is not a palindrome");
		}

	}

}
