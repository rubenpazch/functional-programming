package lab5.prob4solution;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;

	//package level access
	Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();
	}

	void addOrder(Order order) {
		orders.add(order);
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}
}
