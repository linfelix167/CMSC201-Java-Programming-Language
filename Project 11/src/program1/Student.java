package program1;

public class Student extends Person{

	private final String status;
	
	public Student(String name, String address, String phone, String email, String status) {
		super(name, address, phone, email);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
	public String toString(){
		return "Name: "+getName()+"\nAddress: "+getAddress()+"\nPhone Number: "+getPhone()
		+"\nEmail:"+getEmail()+"\nStatus: "+getStatus();
	}

}
