
/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Fan
 * Due: 11/11/2016
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Lin, Ho Chien
*/

public class TestFan {
	public static void main(String args[]){
		
		Fan obj1 = new Fan();
		Fan obj2 = new Fan();
		
		obj1.setColor("yellow");
		obj1.setOn(true);
		obj1.setRadius(10.0);
		obj1.setSpeed(3);
		System.out.println(obj1.toString());
		
		obj2.setColor("blue");
		obj2.setOn(false);
		obj2.setRadius(5.0);
		
		System.out.println(obj2.toString());
	}
}
