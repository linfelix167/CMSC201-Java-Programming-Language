package project;
import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Triangle Program
 * Due: 11/22/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/

public class DriverTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double side1, side2, side3;
		String color, filled;
		
		System.out.print("Enter side 1 of triangle:");
		side1 = in.nextDouble();
		System.out.print("Enter side 2 of triangle:");
		side2 = in.nextDouble();
		System.out.print("Enter side 3 of triangle:");
		side3 = in.nextDouble();
		in.nextLine();
		System.out.print("Enter color of triangle:");
		color = in.nextLine();
		System.out.print("Enter whether triangle is filled (yes/no):");
		filled = in.nextLine();
		
		Triangle test = new Triangle(side1, side2, side3);
		test.setColor(color);
		if(filled.equalsIgnoreCase("Yes") || filled.equalsIgnoreCase("yes")){
			test.setFilled(true);
		}
		else if(filled.equalsIgnoreCase("No") || filled.equalsIgnoreCase("no")){
			test.setFilled(false);
		}
		
		System.out.println("Area: "+ test.getArea());
		System.out.println("Perimeter: "+ test.getPerimeter());
		System.out.println("Color: "+ test.getColor());
		System.out.println("Folled?: "+ test.isFilled());
	}

}
