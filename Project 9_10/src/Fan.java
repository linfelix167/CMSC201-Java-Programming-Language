
public class Fan {
	
	private final int SLOW = 1;
	private final int MEDIUM =2;
	private final int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan(){
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		if(on){
			str.append("A ");
			str.append(radius);
			str.append(" inches ");
			str.append(color);
			str.append(" fan at a speed of ");
			str.append(speed);
		}else{
			str.append("A ");
			str.append(radius);
			str.append(" inches ");
			str.append(color);
			str.append("fan; fan is off");
		}
		return str.toString();
	}
	
	
}
