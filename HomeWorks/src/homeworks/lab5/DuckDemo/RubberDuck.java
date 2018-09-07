package lab5.DuckDemo;

import lab5.DuckDemo.flyTypes.CannotFly;
import lab5.DuckDemo.quackTypes.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		fb = new CannotFly();
		qb = new Squeak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\tdisplaying");
	}
}
