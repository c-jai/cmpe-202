
public class Bun extends LeafDecorator {

	private String option = "";
	
	public Bun(String d) {
		super(d);
	}

	//special price for gluten free, hawaiian and pretezel bun, rest no charge
	@Override
	public void setOptions(String[] options) {
		
		
		if(options.length >0) { //to check if it is "on a bun" or "in a bowl"
			this.option = options[0];
			
			if("Gluten-Free Bun".equals(options[0]) || "Hawaiian Bun".equals(options[0]))
				this.price += 1.00;
			else if("Pretzel Bun".equals(options[0]))
				this.price = 0.50;
		}
		
	}

	@Override
	public String getDescription() {
		
		return option;
	}

}
