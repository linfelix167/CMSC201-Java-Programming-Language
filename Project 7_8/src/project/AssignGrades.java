package project;
import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Assign Grades
 * Due: 10/23/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/

public class AssignGrades {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		System.out.print("Enter the number of students: ");
		number = in.nextInt();
		
		int[] student = new int[number];
		int maxScore = 0;
		System.out.print("Enter "+number+" scores: ");
		
		for(int i = 0; i < student.length;i++){
			
			student[i] = in.nextInt();
			if(maxScore < student[i]){
				maxScore = student[i];
			}
		}
		
		char letter=' ';
		for(int i =0;i<student.length;i++){
			if(student[i] >= maxScore - 10){
				letter = 'A';
			}
			else if(student[i] >= maxScore -20){
				letter = 'B';
			}
			else if(student[i] >= maxScore - 30){
				letter = 'C';
			}
			else if(student[i] >= maxScore - 40){
				letter = 'D';
			}
			else{
				letter = 'F';
			}
			System.out.println("Student "+i+" score is "+student[i]+
					" and grade is "+letter);
		}
		
	}

}
