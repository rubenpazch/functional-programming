package mpp.lesson7.task.prob4;

public interface Squeakable{
	public default void quack() {
		System.out.println("	squeaking");
	}
}
