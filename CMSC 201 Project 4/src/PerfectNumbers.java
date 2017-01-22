

public class PerfectNumbers {
	/*
	 * Class: CMSC201 
	 * Instructor: Ashique Tanveer
	 * Description: Perfect Number
	 * Due: 10/1/2016
	 * I pledge that I have completed the programming assignment independently.
	   I have not copied the code from a student or any source.
	   I have not given my code to any student.
	   Print your Name here: Ho Chien, Lin
	*/
	public static void main(String[] args) {
		
		for(int x = 1; x <=1000; x++){
			isPerfect(x);
		}

	}
	
	public static void isPerfect(int a){
		int j = 0;
		for(int i =1; i<a; i++){
			if(a % i == 0){
				j += i;
			}
		}
		if(a == j){
			System.out.print("\n"+a+" is a perfect number it's factor are ");
			for(int k =1; k<a;k++){
				if(a %k == 0){
					System.out.print(k+" ");
				}
			}
		}
	}

}
