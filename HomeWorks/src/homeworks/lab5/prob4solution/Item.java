package lab5.prob4solution;

public class Item {
	String name;

	//package level access
	Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
