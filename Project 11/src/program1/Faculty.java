package program1;

public class Faculty extends Employee{

	private String officeHour;
	private String rank;
	
	public Faculty(String name, String address, String phone, String email,
			int officeNum, int salary, MyDate hired, String officeHour, String rank) {
		super(name, address, phone, email, officeNum, salary, hired);
		this.officeHour = officeHour;
		this.rank = rank;
	}

	public String getOfficeHour() {
		return officeHour;
	}

	public void setOfficeHour(String officeHour) {
		this.officeHour = officeHour;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString(){
		return "Name: "+getName()+"\nAddress: "+getAddress()+"\nPhone Number: "+getPhone()
		+"\nEmail:"+getEmail()+"\nOffice Number: "+getOfficeNum()+"\nSalary: $"+getSalary()
		+"\nHired Date: "+getHired()+"\nOffice Hour: "+getOfficeHour()+"\nRank: "+getRank();
	}

}
