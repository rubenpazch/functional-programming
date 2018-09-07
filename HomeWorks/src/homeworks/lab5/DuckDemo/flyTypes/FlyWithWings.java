package lab5.DuckDemo.flyTypes;

import lab5.DuckDemo.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("\tFly With Wings");
	}
	
}
