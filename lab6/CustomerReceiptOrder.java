package fiveguys;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
		Double totalPrice = 0.00;
		printString += "\n********************************";
		printString += "\nFIVE GUYS\nBURGERS AND FRIES\nSTORE # CA-1294\n5353 ALMADEN EXPY N60\nSAN JOSE, CA 95118\n(P) 408-264-9300\n\n";
		printString +=  LocalDate.now()+"  "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))+"\n"; 
		printString += "FIVE GUYS\n\n";
		printString += "Order Number: " + order.getOrderID() + "\n";
		
		for(OrderItem oi : orderItems){
			
			printString += "\n" + oi.getQuantity() + "     " + oi.getName() + "     " + oi.getPrice() + "\n";
			
			ArrayList<BurgerComponent> burgerComponents = oi.getBurgerComponents();
			
			for(BurgerComponent bc : burgerComponents){
			
				if(bc.getIsOnBottomBun())
					printString += "     " + "{{{";
				
				else if(bc.getIsOnPatty())
					printString += "     " + "->|";
				
				else
					printString += "     ";
			
				printString += bc.getItemName();
				if(bc.getIsOnBottomBun())
					printString += "}}}";
				printString += "\n";
			}
			totalPrice += oi.getPrice();	
		}
		
		DecimalFormat dec = new DecimalFormat("0.00");
		printString += "\n\n" + "   Sub. Total:    $" + String.valueOf(dec.format(totalPrice));
		printString += "\n" + "   Tax:           $" + String.valueOf(dec.format(totalPrice * 0.09));
		printString += "\n" + "   Total:         $" + String.valueOf(dec.format(totalPrice + totalPrice * 0.09));
		printString += "\n\n" + "   Cash $20     $20.00";
		printString += "\n" + "   Change       $10.87";
		printString += "\n\n" + "Register:1   Tran Seq No.5784";
		printString += "\nCashier:Sakda* S.";
		
		printString += "\nDon't throw away your receipt!!!";
		printString += "\n********************************";
		return printString;

	}

}
