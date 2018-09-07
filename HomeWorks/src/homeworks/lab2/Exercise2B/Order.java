package lab2.Exercise2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int ordernum;
	private List<OrderLine> orderslines;

	public Order (int OrderNum) {
		ordernum=OrderNum;
		orderslines = new ArrayList<>();
	}
	
}
