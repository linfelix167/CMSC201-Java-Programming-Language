import java.text.DecimalFormat;

/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Average Speed
 * Due: 09/01/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ho Chien, Lin
*/

public class AvgSpeed {
	 public static void main(String [] args) {
		 double hours = 1;
	     double minutes = 40;
	     double seconds = 35;
	     double distanceInMiles = 24;
	     double distanceInKilometers = distanceInMiles * 1.6;
	     double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;
	     double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;
	     DecimalFormat dec = new DecimalFormat("#0.00000000000000"); 
	     System.out.println(dec.format(kilometersPerHour));
		  }
		
}
