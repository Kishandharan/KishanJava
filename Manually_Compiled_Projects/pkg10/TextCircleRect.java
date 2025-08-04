package pkg10;

public class TextCircleRect {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(100, 100);
		Circle cir1 = new Circle(1000);
		
		double rectArea = rect1.getArea();
		double cirArea = cir1.getArea();
		double rectPerimeter = rect1.getPerimeter();
		
		System.out.println(rectArea);
		System.out.println(rectPerimeter);
		System.out.println(cirArea);
	}
}
