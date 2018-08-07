package mpp.lesson7.task.prob4;

public interface Unquackable{
	public default void quack() {
		System.out.println("	cannot quack");
	}
}
