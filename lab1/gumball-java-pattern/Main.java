
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Please select the type of the gumball machine you want to operate: ");
        System.out.println("Type 1: Cost: 25 cents, accepts only quarters");
        System.out.println("Type 2: Cost: 50 cents, accepts only quarters");
        System.out.println("Type 3: Cost: 50 cents, accepts only nickels, dimes and quarters");
        System.out.println("Instantiate Gumball Machine using number of gumballs and type");
        
        //testing type 1 gumball machine
        GumballMachine gumballMachine = new GumballMachine(5,1);

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    
        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        //testing type 2 gumball machine
        System.out.println("**********************Testing type 2**************************");
        GumballMachine gumballMachine_2 = new GumballMachine(5,2);
        
        gumballMachine_2.insertCoin(25);
        gumballMachine_2.insertCoin(25);
        
        gumballMachine_2.insertCoin(25);
        
        gumballMachine_2.turnCrank();
        
        gumballMachine_2.insertCoin(10);
        
        System.out.println(gumballMachine_2);
        gumballMachine_2.insertCoin(25);
        gumballMachine_2.insertCoin(10);
        gumballMachine_2.insertCoin(25);
        gumballMachine_2.turnCrank();
        System.out.println(gumballMachine_2);
        
        System.out.println("**********************Testing type 3**************************");
        GumballMachine gumballMachine_3 = new GumballMachine(5,3);
        gumballMachine_3.ejectCoin();
        gumballMachine_3.insertCoin(25);
        gumballMachine_3.insertCoin(25);
        gumballMachine_3.ejectCoin();
        gumballMachine_3.insertCoin(25);
        gumballMachine_3.ejectCoin();
        gumballMachine_3.turnCrank();
        
        gumballMachine_3.insertCoin(10);
        
        System.out.println(gumballMachine_3);
        gumballMachine_3.insertCoin(25);
        gumballMachine_3.insertCoin(10);
        gumballMachine_3.insertCoin(25);
        gumballMachine_3.turnCrank();
        System.out.println(gumballMachine_3);
    }
}
