package lab3.prob3;

public class Cylinder {
	protected double radius;
	protected double height;
	
	Cylinder ( ){
		
	}
	Cylinder ( double poRadius, double poHeight){
		this.radius = poRadius;
		this.height = poHeight;
	}
	
	public double computeVolumen() {
		return Math.PI*radius*radius*height;
	}
	
}
