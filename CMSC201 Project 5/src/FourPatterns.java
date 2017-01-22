import java.util.Scanner;
/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Four Patterns
 * Due: 10/09/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien Lin
*/

public class FourPatterns {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int limit;
		
		System.out.print("Enter an integer to be a limit of the pattern:");
		limit = in.nextInt();
		
		System.out.println("Pattern A");
		for(int i =1; i<= limit;i++){
			for(int j =1; j <=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\nPattern B");
		int a = limit;
		for(int i =1; i<= limit;i++){
			for(int j =1; j <=a;j++){
				System.out.print(j);
			}
			a--;
			System.out.println();
		}
		System.out.println("\nPattern C");
		for(int i=1;i<=limit;i++){
			for(int j=i;j>0;j--){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\nPattern D");
		a =limit;
		for(int i=1;i<=limit;i++){
			for(int j=1;j<=a;j++){
				System.out.print(j);
			}
			a--;
			System.out.println();
		}
		
	}
}
