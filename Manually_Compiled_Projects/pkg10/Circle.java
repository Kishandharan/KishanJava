package pkg10;

public class Circle {
	double rad;
	public Circle(double rad) {
		this.rad = rad;		
	}
	
	double getArea(){
		return Math.PI * Math.pow(rad, 2);
	}
}
