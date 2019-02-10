

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertCoin(int coin) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectCoin() {
        System.out.println("Gumball machine cannot eject the inserted coins at this stage, sorry!");
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
      
        gumballMachine.releaseBall();
        
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getInsufficientPaymentState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}


