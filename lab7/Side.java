
public class Side extends LeafDecorator{

	private String option = "";
	
	public Side(String d) {
		super(d);
	}

	@Override
	public void setOptions(String[] options) {
		
		
		if(options.length >0) { //to check if it is "on a bun" or "in a bowl"
			this.option = options[0];
			
			this.price = 3.00;
		}
		
	}

	@Override
	public String getDescription() {
		
		
		return option;
	}

}
