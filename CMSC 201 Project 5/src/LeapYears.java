import java.util.Scanner;
class LeapYears {

	public static void main(String[] args) {
		int start, end;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the starting year: ");
		start = in.nextInt();
		System.out.print("Enter the ending year: ");
		end = in.nextInt();
		in.close();
		int count = 0;
		int total=0;
		for(int i = start;i<=end;i++){
			if(i%4 == 0){
				System.out.print(i+" ");
				count++;
				total++;
			}
			
			if(count%10 ==0&& count>0){
				System.out.println();
				count = 0;
			}
		}
		
		System.out.println("\nThere were "+total+" leap years from "+start+" to "+end);

	}

}
