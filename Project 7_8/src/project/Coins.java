package project;
import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Coins
 * Due: 10/23/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/

public class Coins {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.print("Enter a number betewwn 0 to 511: ");
	    int n = in.nextInt();
	    
	    int[] matrix = decimalTobinary(n);
	    printArray(matrix);
	       
	}
	
	public static int[] decimalTobinary(int a){
		int[] number = new int[9];
		
		for(int i =number.length-1; i >= 0 && a > 0;i--){
			if(a % 2==0){
				number[i] =0;
			}
			else{
				number[i] =1;
			}
			a /= 2;
		}
		return number;
	}
	
	public static void printArray(int[] b){
		for(int i=0;i<9;i++){
			if(b[i] == 0){
				System.out.print("H ");
			}
			else{
				System.out.print("T ");
			}
			
			if((i+1) % 3 == 0){
				System.out.println();
			}
		}
	}

}
