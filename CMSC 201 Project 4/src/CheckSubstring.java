import java.util.Scanner;
/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Check substring
 * Due: 09/30/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/

public class CheckSubstring {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s1, s2;
		System.out.print("Enter string s1: ");
		s1 = input.nextLine();
		System.out.print("Enter string s2: ");
		s2 = input.nextLine();
		if(s1.contains(s2)){
			System.out.println(s2+" is a substring of "+s1);
		}else{
			System.out.println(s2+" is not a substring of "+s1);
		}
	}
}
