package fiveguys;

import java.util.ArrayList;

public class OrderItem {
	ArrayList<BurgerComponent> burgerComponents;
	Double price;
	int quantity;
	String name;
	
	public OrderItem(String n, int q, Double p){
		burgerComponents = new ArrayList<BurgerComponent>();
		name = n;
		quantity = q;
		price = p;
	}
	
	public void addBurgerComponent(BurgerComponent bc){
		burgerComponents.add(bc);
	}
	
	public ArrayList<BurgerComponent> getBurgerComponents(){
		return burgerComponents;
	}
	
	public int getQuantity(){
		return quantity;
	}
	public Double getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}
}
