import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: FutureDates program
 * Due: 09/22/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/

public class FutureDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int today, addDays, totalDays;
		
		System.out.print("Enter today's day:");
		today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today:");
		addDays = input.nextInt();
		   
		  String weekDay = "";
		   
		  switch(today){
		   case 1:
			   weekDay= "Monday";
			   break;
		   case 2:
			   weekDay= "Tuesday";
			   break;
		   case 3:
			   weekDay= "Wednesday";
			   break;
		   case 4:
			   weekDay= "Thursday";
			   break;
		   case 5:
			   weekDay= "Friday";
			   break;
		   case 6:
			   weekDay= "Saturday";
			   break;
		   case 0:
			   weekDay= "Sunday";
			   break;
			default: 
				weekDay = "An invalid starting day. Today's day must be 0-6.";
				break;
		  }
		  System.out.print("Today is " + weekDay + " and the future day is " );
		   
		  totalDays = (today + addDays);
		   
		  switch(totalDays%7){
		   case 1:
			   weekDay= "Monday";
			   break;
		   case 2:
			   weekDay= "Tuesday";
			   break;
		   case 3:
			   weekDay= "Wednesay";
			   break;
		   case 4:
			   weekDay= "Thursday";
			   break;
		   case 5:
			   weekDay= "Friday";
			   break;
		   case 6:
			   weekDay= "Saturday";
			   break;
		   case 0:
			   weekDay= "Sunday";
			   break;
		  }
		  System.out.println(weekDay);
		 }
	}



