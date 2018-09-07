package lab5.DuckDemo;

import lab5.DuckDemo.interfaces.FlyBehavior;
import lab5.DuckDemo.interfaces.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior fb;
	protected QuackBehavior qb;
		
	public abstract void display();

	public void quack() {
		qb.quack();
	}
	
	public void fly() {
		fb.fly();
	}
	
	public void swim()
	{
		System.out.println("\tSwimming");
	}
}
