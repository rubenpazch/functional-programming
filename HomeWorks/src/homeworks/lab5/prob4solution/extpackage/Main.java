package lab5.prob4solution.extpackage;

import java.time.LocalDate;

import lab5.prob4solution.CustOrderFactory;
import lab5.prob4solution.Customer;
import lab5.prob4solution.Order;



public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.newCustomer("Bob");
		
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		CustOrderFactory.newItem(order, "Shirt");
		CustOrderFactory.newItem(order, "Laptop");
		
		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		CustOrderFactory.newItem(order, "Pants");
		CustOrderFactory.newItem(order, "Knife set");
		
		System.out.println(cust.getOrders());
	}
}

		
