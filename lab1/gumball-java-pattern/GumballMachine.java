
import java.util.ArrayList;
public class GumballMachine {
 
    State soldOutState;
    State insufficientPaymentState;
    State completePaymentState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    
    private int amount; 
    private int remainingAmount;
    private ArrayList<Integer> acceptedCoins;
    
    public GumballMachine(int numberGumballs, int type) {
        soldOutState = new SoldOutState(this);
        insufficientPaymentState = new InsufficientPaymentState(this);
        completePaymentState = new CompletePaymentState(this);
        soldState = new SoldState(this);
        this.acceptedCoins = new ArrayList<Integer>();
        
        if(type == 1){
             this.amount = 25;
             this.acceptedCoins.add(25);
        }
        else if(type == 2){
            this.amount = 50;
            this.acceptedCoins.add(25);
        }
        else{
            this.amount = 50;
            this.acceptedCoins.add(5);
            this.acceptedCoins.add(10);
            this.acceptedCoins.add(25);
        }
       
        this.remainingAmount = this.amount;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = insufficientPaymentState;
        } 
    }
 
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = insufficientPaymentState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getInsufficientPaymentState() {
        return insufficientPaymentState;
    }

    public State getCompletePaymentState() {
        return completePaymentState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    
    public int getAmount(){
        return this.amount;
    }
    
     public int getRemainingAmount(){
        return this.remainingAmount;
    }
    
    public void setRemainingAmount(int amt){
        this.remainingAmount = amt;
    }
    
     public ArrayList<Integer> getAcceptedCoins(){
        return this.acceptedCoins;
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nThe Mighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
