import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: CharCounter
 * Due: 09/30/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/

public class CharCounter {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s;
		char a;
		System.out.print("Enter a string: ");
		s = input.nextLine();
		System.out.print("Enter a character: ");
		a = input.next().charAt(0);
		System.out.println(a+" occurs "+count(s,a)+" times in the string");
		
	}
	
	public static int count(String str, char a){
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(a == str.charAt(i)){
				count++;
			}	
		}
		return count;
	}
}
