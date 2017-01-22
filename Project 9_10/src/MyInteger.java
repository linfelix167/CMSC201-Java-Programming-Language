
public class MyInteger {
	
	private int value;
	
	public MyInteger(int a){
		this.value = a;
	}

	public int getValue() {
		return value;
	}
	public boolean isEven(){
		boolean a = false;
		if(value % 2 == 0){
			a = true;
		}
		return a;	
	}
	
	public boolean isOdd(){
		boolean a = false;
		if(value % 2 == 1){
			a = true;
		}
		return a;
	}
	
	public boolean isPrime(){
		boolean a = false;
		if(isPrime(value)){
			a = true;
		}
		return a;
	}
	
	public static boolean isEven(int value){
		boolean a = false;
		if(value % 2 == 0){
			a = true;
		}
		return a;	
	}
	
	public static boolean isOdd(int value){
		boolean a = false;
		if(value % 2 == 1){
			a = true;
		}
		return a;
	}
	
	public static boolean isPrime(int value){
		boolean a= true;
		if(value % 2 == 0){
			a = false;
		}
		for(int i =3; i*i<=value;i+=2){
			if(value %i == 0)
				a = false;
		}
		return a;
	}
	
	public static boolean isEven(MyInteger value){
		return value.isEven(value.getValue());
	}
	
	public static boolean isOdd(MyInteger value){
		return value.isOdd(value.getValue());
	}
	
	public static boolean isPrime(MyInteger value){
		return value.isPrime(value.getValue());
	}
	
	public boolean equals(int a){
		return value == a;
	}
	
	public boolean equals(MyInteger a){
		return equals(a.getValue());
	}
	
	public static int parselnt(char[] a){
		return parselnt(new String(a));
	}
	
	public static int parselnt(String str){
		return Integer.parseInt(str);
	}
}
