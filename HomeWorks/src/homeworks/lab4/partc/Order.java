package lab4.partc;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Order {
	
	private int orderNo ;
	private Date orderDate;
	private int orderAmount ;
		
	public Order(int orderNo,  int year, int month, int day, int orderAmount) {
		super();
		this.orderNo = orderNo;
		GregorianCalendar cal = 
				new GregorianCalendar(year,month,day);
		orderDate= cal.getTime();
		this.orderAmount = orderAmount;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public Date getOrderDate() {
		return (Date)orderDate.clone();
	}
	
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	
	

}
