package pkg10;

public class Rectangle {
	double l;
	double w;
	public Rectangle(double l, double w){
		this.l = l;
		this.w = w;
	}
	
	double getArea() {
		return l*w;		
	}
	
	double getPerimeter() {
		return 2*(l+w);
	}
}
