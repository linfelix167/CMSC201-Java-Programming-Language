import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: MyInteger
 * Due: 11/11/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Lin, Ho Chien
*/

public class TestMyInteger {
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer to create a MyInteger "
				+ "object or to move on to next part of program :");
		int value = in.nextInt();
		
		MyInteger obj0 = new MyInteger(value); 
		
		System.out.println(obj0. getValue());
		System.out.println(obj0. isEven());
		System.out.println(obj0. isOdd());
		System.out.println(obj0. isPrime());
		
		System.out.print("Enter a positive integer to test static isXXX(int) methods: ");
		int value2 = in.nextInt();
		System.out.println(MyInteger.isEven(value2));
		System.out.println(MyInteger.isOdd(value2));
		System.out.println(MyInteger.isPrime(value2));
		
		System.out.println("Enter a positive integer to test static isXXX(MyInteger) methods: ");
		int value3 = in.nextInt();
		MyInteger obj1 = new MyInteger(value3);
		System.out.println(MyInteger.isEven(obj1));
		System.out.println(MyInteger.isOdd(obj1));
		System.out.println(MyInteger.isPrime(obj1));
		
		System.out.print("Enter two integer to test equals(int) method: ");
		int value4 = in.nextInt();
		int value5 = in.nextInt();
		MyInteger obj2 = new MyInteger(value4);
		System.out.println(obj2.equals(value5));
	}
}
