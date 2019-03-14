package fiveguys;

public class Main {

	public static void main(String[] args) {
		
		Order order = new Order("45");
		OrderItem oi_1 = new OrderItem("LBB");
		oi_1.addBurgerComponent(new BurgerComponent("Bacon"));
		oi_1.addBurgerComponent(new BurgerComponent("Lettuce"));
		oi_1.addBurgerComponent(new BurgerComponent("Tomato"));
		oi_1.addBurgerComponent(new BurgerComponent("Grilled Onion"));
		oi_1.addBurgerComponent(new BurgerComponent("Grilled Jalapeno"));
		
		OrderItem oi_2 = new OrderItem("LTL CAJ");
		
		order.addOrderItem(oi_1);
		order.addOrderItem(oi_2);
		
		order.setPrintStrategy(new CustomerReceiptOrder());
		System.out.println(order.print());
		
		order.setPrintStrategy(new PackingSlipOrder());
		System.out.println(order.print());

	}

}
