package pkg11;

public class ResizableCircle implements Resizable{
	private double radius;
	
	ResizableCircle(double radius){
		this.radius = radius;		
	}

	@Override
	public void resize(double radius) {
		this.radius = radius;		
	}
	
	public double getRadius() {
		return this.radius;
	}
}
