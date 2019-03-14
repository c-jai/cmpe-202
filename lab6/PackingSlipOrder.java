package fiveguys;

import java.util.ArrayList;

public class PackingSlipOrder implements PrintOrderStrategy
{
	//Order order;
	
	
	public PackingSlipOrder() {
		//this.order = o;
	}
	@Override
	public String print(Order order) {
		
		String finalString = "";
		ArrayList<OrderItem> items = order.getOrderItems();
		for(OrderItem oi : items){
			
			String orderName = "";
			String onTopBun = "";
			String onBottomBun = "";
			String onPatty = "";
			
			orderName = oi.getName() + "\n";
			
			ArrayList<BurgerComponent> burgerComponents = oi.getBurgerComponents();
			for(BurgerComponent bc : burgerComponents){
				if(bc.getIsOnTopBun()){
					onTopBun += bc.getItemName();
					onTopBun += "\n";
				}
			
				else if(bc.getIsOnPatty()){
					onPatty += "->|";
					onPatty += bc.getItemName();
					onPatty += "\n";
				}
			
				else{
					onBottomBun += "{{{";
					onBottomBun += bc.getItemName();
					onBottomBun += "}}}";
				}
			}
			finalString += orderName + onTopBun + onPatty + onBottomBun + "\n";
		}
		
		
		return finalString;

	}

}
