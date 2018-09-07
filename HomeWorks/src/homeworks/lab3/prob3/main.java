package lab3.prob3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cy1 = new Cylinder(12,24);
		
		System.out.println("cylinder 1 "+cy1.computeVolumen());
		
		Cylinder cy2 = new Cylinder(7,23);
		
		System.out.println("cylinder 2 "+cy2.computeVolumen());
		
		Circle ci1 = new Circle(cy1);
		
		
		System.out.println("circle area 1 " + ci1.computerArea());
		
	}

}
