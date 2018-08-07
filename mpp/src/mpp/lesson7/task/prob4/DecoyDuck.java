package mpp.lesson7.task.prob4;

public class DecoyDuck extends Duck implements Unflyable, Unquackable {

	@Override
	public void display() {
		System.out.println("	displaying");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Unflyable.super.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Unquackable.super.quack();
	}

}
