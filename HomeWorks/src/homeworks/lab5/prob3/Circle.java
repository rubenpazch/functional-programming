package lab5.prob3;

public class Circle implements Shape {
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	

	public double getRadius() {
		return radius;
	}



	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}
