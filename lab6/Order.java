package fiveguys;

import java.util.ArrayList;

public class Order {
	ArrayList<OrderItem> orderItems;
	String orderID;
	private PrintOrderStrategy printStrategy;
	
	public Order(String id){
		orderID = id;
		orderItems = new ArrayList<OrderItem>();
	}
	
	public void addOrderItem(OrderItem oi){
		orderItems.add(oi);
	}
	
	public ArrayList<OrderItem> getOrderItems(){
		return orderItems;
	}
	
	public Double getTotalPrice(){
		return 0.00;
	}
	
	public void setPrintStrategy(PrintOrderStrategy ps){
		printStrategy = ps;
	}
	
	public String print(){
		return printStrategy.print(this);
	}
}
