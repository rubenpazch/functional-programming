package lab3.prob3;

public class Circle {
	
	Cylinder newcylinder;
	
	public Circle(Cylinder c) {
		this.newcylinder = c;		
	}
	
	public double computerArea(){
		return newcylinder.radius*newcylinder.radius* Math.PI;
	}
	
}
