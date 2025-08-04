package pkg11;

public class Main {
	public static void main(String[] args) {
		Resizable resizable1 = new ResizableCircle(7); 
		double radius1 = resizable1.getRadius();
		System.out.println("Original radius - "+radius1);
		resizable1.resize(50);
		radius1 = resizable1.getRadius();
		System.out.println("Resized radius - "+radius1);
	}
}
