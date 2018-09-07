package lab4.partc;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	
	private double commission;
	private double baseSalary;
	private List<Order> orders = new ArrayList<>();
	
	public Commissioned(int empId, double commission, double baseSalary, List<Order> o) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders=o;
	}


	@Override
	double calcGrossPay(int month, int year) {
		double totalOrder = 0;
		for (Order order : orders) {
			totalOrder= totalOrder+order.getOrderAmount();
		}
		return baseSalary+totalOrder*(commission/100);
	}


	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
}
