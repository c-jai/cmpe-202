  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger_1 = new CustomBurger( "Build Your Own Burger" ) ;
        
        
        Burger burger_1 = new Burger( "Burger Options" ) ;
        String[] bo_1 = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        burger_1.setOptions( bo_1 ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese cheese_1 = new Cheese( "Cheese Options" ) ;
        String[] co_1 = { "Yellow American", "Spicy Jalapeno Jack" } ;
        cheese_1.setOptions( co_1 ) ;
        cheese_1.wrapDecorator( burger_1 ) ;
        
        // premium cheese +1.50 each
        PremiumCheese premiumCheese_1 = new PremiumCheese("Premium Cheese options");
        String[] pco_1 = { "Danish Blue Cheese"} ;
        premiumCheese_1.setOptions( pco_1 ) ;
        premiumCheese_1.wrapDecorator( cheese_1 ) ;
        
        
        // 1 sauce free, extra +.50
        Sauce sauce_1 = new Sauce( "Sauce Options" ) ;
        String[] so_1 = { "Mayonnaise", "Thai Peanut Sauce" } ;
        sauce_1.setOptions( so_1 ) ;
        sauce_1.wrapDecorator( premiumCheese_1 ) ;
        
        // unlimited toppings @no charge
        Toppings toppings_1 = new Toppings( "Toppings Options" ) ;
        String[] to_1 = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
        toppings_1.setOptions( to_1 ) ;
        toppings_1.wrapDecorator( sauce_1 ) ;
        
        // premium topping +1.00 to +3.00
        PremiumTopping premiumToppings_1 = new PremiumTopping( "Premium Options" ) ;
        String[] po_1 = { "Marinated Tomatoes" } ;
        premiumToppings_1.setOptions( po_1 ) ;
        premiumToppings_1.wrapDecorator( toppings_1 ) ;
        
        // bun @no charge
        Bun bun_1 = new Bun( "Bun Option" ) ;
        String[] bun_o_1 = { "Ciabatta (Vegan)" } ;
        bun_1.setOptions( bun_o_1 ) ;
        bun_1.wrapDecorator( premiumToppings_1 ) ;
        
        // side +3.00 each
        Side side_1 = new Side( "Side Option" ) ;
        String[] side_o_1 = { "Shoestring Fries" } ;
        side_1.setOptions( side_o_1 ) ;
        side_1.wrapDecorator( bun_1 ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger_1.setDecorator( side_1 ) ;
        customBurger_1.addChild( burger_1 ) ;
        customBurger_1.addChild( cheese_1 ) ;
        customBurger_1.addChild( premiumCheese_1 ) ;
        customBurger_1.addChild( sauce_1 ) ;
        customBurger_1.addChild( toppings_1 ) ;
        customBurger_1.addChild( premiumToppings_1 ) ;
        customBurger_1.addChild( bun_1 ) ;
        customBurger_1.addChild( side_1 ) ;
        
        CustomBurger customBurger_2 = new CustomBurger( "Build Your Own Burger" ) ;
        
        Burger burger_2 = new Burger( "Burger Options" ) ;
        String[] bo_2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        burger_2.setOptions( bo_2 ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese cheese_2 = new Cheese( "Cheese Options" ) ;
        String[] co_2 = { "Smoked Gouda", "Greek Feta" } ;
        cheese_2.setOptions( co_2 ) ;
        cheese_2.wrapDecorator( burger_2 ) ;
        
        // premium cheese +1.50 each
        PremiumCheese premiumCheese_2 = new PremiumCheese("Premium Cheese options");
        String[] pco_2 = { "Fresh Mozzarella"} ;
        premiumCheese_2.setOptions( pco_2 ) ;
        premiumCheese_2.wrapDecorator( cheese_2 ) ;
        
        
        // 1 sauce free, extra +.50
        Sauce sauce_2 = new Sauce( "Sauce Options" ) ;
        String[] so_2 = { "Habanero Salsa" } ;
        sauce_2.setOptions( so_2 ) ;
        sauce_2.wrapDecorator( premiumCheese_2 ) ;
        
        // unlimited toppings @no charge
        Toppings toppings_2 = new Toppings( "Toppings Options" ) ;
        String[] to_2 = { "Crushed Peanuts"} ;
        toppings_2.setOptions( to_2 ) ;
        toppings_2.wrapDecorator( sauce_2 ) ;
        
        // premium topping +1.00 to +3.00
        PremiumTopping premiumToppings_2 = new PremiumTopping( "Premium Options" ) ;
        String[] po_2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        premiumToppings_2.setOptions( po_2 ) ;
        premiumToppings_2.wrapDecorator( toppings_2 ) ;
        
        // bun @no charge
        Bun bun_2 = new Bun( "Bun Option" ) ;
        String[] bun_o_2 = { "Gluten-Free Bun" } ;
        bun_2.setOptions( bun_o_2 ) ;
        bun_2.wrapDecorator( premiumToppings_2 ) ;
        
        // side +3.00 each
        Side side_2 = new Side( "Side Option" ) ;
        String[] side_o_2 = { "Shoestring Fries" } ;
        side_2.setOptions( side_o_2 ) ;
        side_2.wrapDecorator( bun_2 ) ;
        
        
        // Setup Custom Burger Ingredients
        customBurger_2.setDecorator( side_2 ) ;
        customBurger_2.addChild( burger_2 ) ;
        customBurger_2.addChild( cheese_2 ) ;
        customBurger_2.addChild( premiumCheese_2 ) ;
        customBurger_2.addChild( sauce_2 ) ;
        customBurger_2.addChild( toppings_2 ) ;
        customBurger_2.addChild( premiumToppings_2 ) ;
        customBurger_2.addChild( bun_2 ) ;
        customBurger_2.addChild( side_2 ) ;
        
        
        
        // Add Custom Burger to the Order
        order.addChild( customBurger_1 );
        order.addChild(customBurger_2);
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/