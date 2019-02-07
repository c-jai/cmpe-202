import java.util.ArrayList;

public class GumballMachine {
    private boolean hasPayment;
    private int numOfGumballs;
    private int amount;
    private int remainingAmount;
    private ArrayList<Integer> acceptedCoins;

    public GumballMachine(int num, int amount, ArrayList<Integer> acceptedCoins){
        this.numOfGumballs = num;
        this.amount = amount;
        this.remainingAmount = amount;
        this.acceptedCoins = acceptedCoins;
        this.hasPayment = false;
    }

    public void acceptPayment(int coin){
        if(!this.acceptedCoins.contains(coin)){
            System.out.println("The machine cannot accept the inserted coin. Please enter from the list of accepted coins only.");
        }
        else{
            this.remainingAmount = this.remainingAmount - coin;
            if(this.remainingAmount <= 0)
                this.hasPayment = true;
            else
                System.out.println("Please enter " + this.remainingAmount + " cents more.");
        }
    }

    public void turnCrank()
    {
        if ( this.hasPayment )
        {
            if ( this.numOfGumballs > 0 )
            {
                this.numOfGumballs-- ;
                this.hasPayment = false ;
                System.out.println( "Thanks for your payment.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your payment." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert amount: " + this.remainingAmount + " cents." ) ;
        }
    }
}
