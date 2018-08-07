package mpp.lesson7.task.prob4;

public interface Flyable {
	default void fly() {
		System.out.println("	fly with wings");
	}
}
