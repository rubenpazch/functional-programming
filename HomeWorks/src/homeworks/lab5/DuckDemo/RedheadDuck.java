package lab5.DuckDemo;

import lab5.DuckDemo.flyTypes.FlyWithWings;
import lab5.DuckDemo.quackTypes.Quack;

public class RedheadDuck extends Duck {
	
	public RedheadDuck()
	{
		fb = new FlyWithWings();
		qb = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("\tdisplaying");
	}
}
