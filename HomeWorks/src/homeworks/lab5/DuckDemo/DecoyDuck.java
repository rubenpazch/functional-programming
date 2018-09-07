package lab5.DuckDemo;

import lab5.DuckDemo.flyTypes.CannotFly;
import lab5.DuckDemo.quackTypes.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		fb = new CannotFly();
		qb = new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\tdisplaying");
	}
}
