package lab5.DuckDemo.quackTypes;

import lab5.DuckDemo.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("\tCannot Quack");
	}
	
}
