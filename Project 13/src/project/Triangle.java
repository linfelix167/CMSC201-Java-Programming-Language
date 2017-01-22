package project;

public class Triangle extends GeometricObject{

	private double side1, side2, side3;
	
	public Triangle(){
		
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	public Triangle(double a, double b, double c){
		
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
	}
	
	@Override
	public double getArea() {
		
		//Heron's formula
		double area;
		double p = (side1 + side2 + side3) / 2;
		area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		
		return area;
	}

	@Override
	public double getPerimeter() {
		
		return (side1 + side2 + side3);
	}

}
