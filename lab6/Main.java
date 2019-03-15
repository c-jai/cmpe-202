package fiveguys;

public class Main {

	public static void main(String[] args) {
		
		Order order = new Order("45");
		OrderItem oi_1 = new OrderItem("LBB", 1, 5.59);
		oi_1.addBurgerComponent(new BurgerComponent("Bacon"));
		oi_1.addBurgerComponent(new BurgerComponent("Lettuce"));
		oi_1.addBurgerComponent(new BurgerComponent("Tomato"));
		oi_1.addBurgerComponent(new BurgerComponent("Grilled Onion"));
		oi_1.addBurgerComponent(new BurgerComponent("Grilled Jalapeno"));
		
		OrderItem oi_2 = new OrderItem("LTL CAJ", 1, 2.79);
		
		order.addOrderItem(oi_1);
		order.addOrderItem(oi_2);
		
		System.out.println("\n\nCustomer Receipt is printed as:");
		order.setPrintStrategy(new CustomerReceiptOrder());
		System.out.println(order.print());
		
		/*System.out.println("\nPacking Slip is printed as:");
		order.setPrintStrategy(new PackingSlipOrder());
		System.out.println(order.print());*/
		
		

	}

}
