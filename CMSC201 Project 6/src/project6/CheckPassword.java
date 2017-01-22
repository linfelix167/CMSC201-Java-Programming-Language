package project6;
import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Check Password
 * Due: 10/13/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho, Chien, Lin
*/

public class CheckPassword {
	public static void main(String[] args)
	{
		String a;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		a = in.nextLine();
		
		if(valid(a))
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Invalid password");
		}
		
	}
	
	/**
	 * This method check the password is valid or invalid
	 * @param a String of password
	 * @return
	 */
	public static boolean valid(String a){
		boolean isValid = true;
		
		if(a.length() < 8)
		{
			isValid = false;
			
		}
		else
		{
			int number = 0; // Calculate number of digit
			
			for(int i = 0; i < a.length();i++)
			{
				if(digit(a.charAt(i)) || letter(a.charAt(i)))
				{
					if(digit(a.charAt(i)))
					{
						number++;
					}
				}
				else
				{
					isValid = false;
					break;
				}
			}
			if(number < 2)
			{
				isValid = false;
			}
		}
		
		return isValid;
		
	}
	
	/**
	 * This method check password contain digit number
	 * @param a digit number character
	 * @return
	 */
	public static boolean digit(char a)
	{
		return (a <= '9' && a >= '0');
	}
	
	/**
	 * This method check password contain uppercase and lowercase of letter
	 * @param a letter character
	 * @return
	 */
	public static boolean letter(char a)
	{
		return(a <= 'z'&&a >= 'a' || a <= 'Z' && a >= 'A');
	}
}
