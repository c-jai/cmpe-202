


import java.util.Random;

public class CompletePaymentState implements State {
    GumballMachine gumballMachine;
 
    public CompletePaymentState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin) {
        System.out.println("You can't insert another coin of " + coin + " cents. Please turn the crank now");
    }
 
    public void ejectCoin() {
        //System.out.println("This gumball machine cannot eject the inserted coins, sorry!");
        
            System.out.println("All coins ejected");
            gumballMachine.setRemainingAmount(gumballMachine.getAmount());
            gumballMachine.setState(gumballMachine.getInsufficientPaymentState());
    
    }
 
    public void turnCrank() {
        System.out.println("Payment has been accepted");
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
        System.out.println("Change returned");
        
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
