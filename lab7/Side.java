
public class Side extends LeafDecorator{

	private String option = "";
	
	public Side(String d) {
		super(d);
	}

	@Override
	public void setOptions(String[] options) {
		
		
		if(options.length >0) { //to check if it is "on a bun" or "in a bowl"
			this.option = options[0];
			if(!"No Side".equals(option))
				this.price = 3.00;
		}
		
	}

	@Override
	public String getDescription() {
		
		
		return option;
	}

}
