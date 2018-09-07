package lab5.DuckDemo.quackTypes;

import lab5.DuckDemo.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior{
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("\tSqueaking");
	}
}
