package fiveguys;

import java.util.ArrayList;

public class CustomerReceiptOrder implements PrintOrderStrategy {

	//Order order;
	
	
	public CustomerReceiptOrder() {
		//this.order = o;
	}
	
	@Override
	public String print(Order order) {
		String printString = "";
		ArrayList<OrderItem> orderItems = order.getOrderItems();
		
		printString += "FIVE GUYS\nBURGERS AND FRIES\nSTORE # CA-1294\n5353 ALMADEN EXPY N60\nSAN JOSE, CA 95118\n(P) 408-264-9300\n\n";
		printString += "12/1/2016   1:46:54 PM\n\n"; //hardcoded the string
		printString += "FIVE GUYS\n\n";
		printString += "Order Number: 45\n\n";
		
		for(OrderItem oi : orderItems){
			
			printString += oi.getName() + "\n";
			
			ArrayList<BurgerComponent> burgerComponents = oi.getBurgerComponents();
			
			for(BurgerComponent bc : burgerComponents){
			
				if(bc.getIsOnBottomBun())
					printString += "{{{";
				
				else if(bc.getIsOnPatty())
					printString += "->|";
			
				printString += bc.getItemName();
				if(bc.getIsOnBottomBun())
					printString += "}}}";
				printString += "\n";
			}
				
		}
		return printString;

	}

}
