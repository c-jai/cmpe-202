package fiveguys;

import java.util.ArrayList;

public class OrderItem {
	ArrayList<BurgerComponent> burgerComponents;
	Double price;
	String name;
	
	public OrderItem(String n){
		burgerComponents = new ArrayList<BurgerComponent>();
		name = n;
	}
	
	public void addBurgerComponent(BurgerComponent bc){
		burgerComponents.add(bc);
	}
	
	public ArrayList<BurgerComponent> getBurgerComponents(){
		return burgerComponents;
	}
	
	public Double getPrice(){
		return 0.00;
	}
	
	public String getName(){
		return name;
	}
}
