public class PremiumTopping extends LeafDecorator
{
    private String[] options ;
    
    
    public PremiumTopping( String d )
    {
        super(d) ;
    }
    
    // premium topping +1.00 to +3.00
    public void setOptions( String[] options )
    {
    	int differentPriceToppingCount = 0;
        this.options = options ;
        if ( options.length > 0 ) {
        	for(String opt : options) {
        		if("Marinated Tomatoes".equals(opt))
        			differentPriceToppingCount++;
        	}
        	this.price += ((options.length - differentPriceToppingCount) * 1.00) + (differentPriceToppingCount * 3.00) ;
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}