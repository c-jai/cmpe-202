package fiveguys;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
		
		finalString += "********************************";
		finalString += "\nPatties - 1";
		finalString += "\n\nOrder Number: " + order.getOrderID();
		finalString += "\n" + LocalDate.now()+"  "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))+"\n";
		finalString += "\nFIVE GUYS";
		finalString += "\n\nSandwich# 1\n";
		for(OrderItem oi : items){
			
			String orderName = "";
			String onTopBun = "";
			String onBottomBun = "";
			String onPatty = "";
			
			
			orderName = "\n" + oi.getQuantity() + "   " + oi.getName() + "\n";
			
			ArrayList<BurgerComponent> burgerComponents = oi.getBurgerComponents();
			for(BurgerComponent bc : burgerComponents){
				if(bc.getIsOnTopBun()){
					onTopBun += "   " + bc.getItemName();
					onTopBun += "\n";
				}
			
				else if(bc.getIsOnPatty()){
					onPatty += "   ->|";
					onPatty += bc.getItemName();
					onPatty += "\n";
				}
			
				else{
					onBottomBun += "   {{{";
					onBottomBun += bc.getItemName();
					onBottomBun += "}}}";
				}
			}
			finalString += orderName + onTopBun + onPatty + onBottomBun + "\n";
		}
		finalString += "Register:1   Tran Seq No.5784";
		finalString += "\nCashier:Sakda* S.";
		finalString += "\n********************************";
		return finalString;

	}

}
