package program1;

public class Employee extends Person{

	private int officeNum;
	private int salary;
	private MyDate hired;
	
	public Employee(String name, String address, String phone, String email, int officeNum, int salary, MyDate hired) {
		super(name, address, phone, email);
		this.officeNum = officeNum;
		this.salary = salary;
		this.hired = hired;
	}

	public int getOfficeNum() {
		return officeNum;
	}

	public void setOfficeNum(int officeNum) {
		this.officeNum = officeNum;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public MyDate getHired() {
		return hired;
	}

	public void setHired(MyDate hired) {
		this.hired = hired;
	}
	
	

}
