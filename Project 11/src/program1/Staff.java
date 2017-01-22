package program1;

public class Staff extends Employee{

	private String title;
	public Staff(String name, String address, String phone, String email, int officeNum, int salary, MyDate hired
			, String title) {
		super(name, address, phone, email, officeNum, salary, hired);
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
		return "Name: "+getName()+"\nAddress: "+getAddress()+"\nPhone Number: "+getPhone()
		+"\nEmail:"+getEmail()+"\nOffice Number: "+getOfficeNum()+"\nSalary: $"+getSalary()
		+"\nHired Date: "+getHired()+"\nTitle: "+getTitle();
	}


}
