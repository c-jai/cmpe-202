/*
 * machine accepts a single quarter only
 */
public class GumballMachine_2
{

    private int num_gumballs;
    private boolean has_fifty_cents;

    public GumballMachine_2( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_fifty_cents = false;
    }

    public void insertFiftyCents(int coin_1, int coin_2)
    {
        if ( coin_1 == coin_2 && coin_1 == 25 )
            this.has_fifty_cents = true ;
        else
            this.has_fifty_cents = false ;
    }

    public void turnCrank()
    {
        if ( this.has_fifty_cents )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_fifty_cents = false ;
                System.out.println( "Thanks for your 50 cents.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your 50 cents." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert 2 quarters" ) ;
        }
    }
}
