package project6;
import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Count Number Of Letters
 * Due: 10/13/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho, Chien, Lin
*/

public class CountNumberOfLetters 
{
	public static void main(String[] args)
	{
		String s;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string of letter, numbers, spaces, and symbols: ");
		s = in.nextLine();
		System.out.println("The number of letters in the string is: "+countLetters(s));
	}
	
	/**
	 * This method get the number of letter in the string
	 * @param s string that will be calculate
	 * @return number of letter
	 */
	public static  int  countLetters(String  s)
	{
		int number = 0; // Accumulator, calculate the number of letter
		
		for(int i =0; i < s.length();i++){
			
			if(letter(s.charAt(i))) // make sure only count number of letter
			{
				number++;
			}
		}
		
		return number;
	}
	
	/**
	 * This method will determine lowercase and uppercase letter
	 * @param a true
	 * @return
	 */
	public static boolean letter(char a)
	{
		return(a <= 'z'&& a >= 'a' || a <= 'Z' && a >= 'A');
	}
}
