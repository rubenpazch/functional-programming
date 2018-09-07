package lab4.partc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1  = new Hourly(1, 20, 100);
		Employee e2  = new Salaried(2, 2500);
				
		Order o1 = new Order(1, 2018,1,1, 300);
		Order o2 = new Order(2, 2018,1,2, 400);
		Order o3 = new Order(3, 2018,1,3, 500);
		List<Order> orders = Arrays.asList(o1,o2,o3);
		
		Employee e3  = new Commissioned(3, 15,1100, orders);
		
		e1.print();		
		System.out.println(e1.calcCompensation(1, 2010));
				
		e2.print();		
		System.out.println(e2.calcCompensation(1, 2010));
		
		e3.print();		
		System.out.println(e3.calcCompensation(1, 2010));
	
	}
}
