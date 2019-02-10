import java.util.ArrayList;

public class GumballMachine {
    private boolean hasPayment;
    private int count;
    private int amount;
    private int remainingAmount;
    private ArrayList<Integer> acceptedCoins = new ArrayList<Integer>();

    public GumballMachine(int num, int type){
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
        this.count = num;
        this.remainingAmount = amount;
        this.hasPayment = false;
    }

    public void acceptPayment(int coin){
        System.out.println("Coin inserted: " + coin + " cents");
        if(!this.acceptedCoins.contains(coin)){
            System.out.println("The machine cannot accept the inserted coin. Please enter from the list of accepted coins only.");
        }
        else{
            this.remainingAmount = this.remainingAmount - coin;
            if(this.remainingAmount <= 0){
                System.out.println("Payment has been accepted");
                this.hasPayment = true;
                this.remainingAmount = this.amount;
            }
            else
                System.out.println("Please enter " + this.remainingAmount + " cents more.");
        }
    }

    public void turnCrank()
    {
        if ( this.hasPayment )
        {
            if ( this.count > 0 )
            {
                this.count-- ;
                this.hasPayment = false ;
                System.out.println( "You turned the crank. Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your payment." ) ;
            }
        }
        else
        {
            if(this.remainingAmount > 0 && this.remainingAmount < this.amount)
                System.out.println("Crank cannot be turned, waiting for " + this.remainingAmount + " cents more");
            else
                System.out.println( "Crank cannot be turned. Please insert amount: " + this.remainingAmount + " cents." ) ;
        }
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
        return result.toString();
    }
}
