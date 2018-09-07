package lab5.DuckDemo.flyTypes;

import lab5.DuckDemo.interfaces.FlyBehavior;

public class CannotFly implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("\tCannot Fly");
	}
	
}
