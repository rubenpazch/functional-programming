package mpp.lesson7.task.prob4;

public interface Unflyable{
	public default void fly() {
		System.out.println("	can not fly");
	}
}
