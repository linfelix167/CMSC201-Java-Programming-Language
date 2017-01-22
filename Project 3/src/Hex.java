import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Hex program
 * Due: 09/22/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/
public class Hex {
	public static void main(String[] args){
	int a;
	String hexValue = "";
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a decimal value(0 to 15):");
	a = input.nextInt();
	
	if(a >= 0 && a <= 15){
		if(a <=9){
			hexValue = String.valueOf(a);
		}
		
		switch(a){
		
		case 10:
			hexValue = "A";
			break;
		
		case 11:
			hexValue = "B";
			break;
			
		case 12:
			hexValue = "C";
			break;
			
		case 13:
			hexValue = "D";
			break;
			
		case 14:
			hexValue = "E";
			break;
			
		case 15:
			hexValue = "F";
			break;
		}
		System.out.println("The hex value is "+hexValue);
	}else{
		System.out.println("Invalid input");
	}
	}
}

