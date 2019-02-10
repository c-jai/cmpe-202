

public class InsufficientPaymentState implements State {
    GumballMachine gumballMachine;
 
    public InsufficientPaymentState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        System.out.println("Coin inserted: " + coin + " cents");
        if(!gumballMachine.getAcceptedCoins().contains(coin)){
            System.out.println("The machine cannot accept the inserted coin. Please enter from the list of accepted coins only.");
           }
        else{
            gumballMachine.setRemainingAmount(gumballMachine.getRemainingAmount() - coin);
            //System.out.println("remaining amount: " + gumballMachine.getRemainingAmount());
            if(gumballMachine.getRemainingAmount() <= 0){
                gumballMachine.setState(gumballMachine.getCompletePaymentState());
                gumballMachine.setRemainingAmount(gumballMachine.getAmount());
            }
            else
                System.out.println("Please enter " + gumballMachine.getRemainingAmount() + " cents more.");
            }
    }
 
    public void ejectCoin() {
      // System.out.println("Gumball Machine cannot eject coins at this stage, sorry!");
      if(gumballMachine.getRemainingAmount() == gumballMachine.getAmount() ){
          System.out.println("No coins to eject");
        }
      else{
       System.out.println("All coins ejected");
       gumballMachine.setRemainingAmount(gumballMachine.getAmount());
    }
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's either no coin or you have not paid the full amount.");
     }
 
    public void dispense() {
        System.out.println("You need to pay the full amount first");
    } 
 
    public String toString() {
        if(gumballMachine.getRemainingAmount() > 0 && gumballMachine.getRemainingAmount() < gumballMachine.getAmount())
            return "waiting for " + gumballMachine.getRemainingAmount() + " cents more";
        else{
            return "waiting for " + gumballMachine.getAmount() + " cents";
        }
    }
}
