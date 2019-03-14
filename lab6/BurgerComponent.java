package fiveguys;

public class BurgerComponent {
	private boolean isOnTopBun = false;
	private boolean isOnBottomBun = false;
	private boolean isOnPatty = false;
	private String itemName;
	
	public BurgerComponent(String name) {
		this.itemName = name;
		
		switch(name){
		case "Bacon":
			this.isOnBottomBun = true;
			break;
		case "Lettuce":
			this.isOnTopBun = true;
			break;
		case "Tomato":
			this.isOnTopBun = true;
			break;
		case "Grilled Onion":
			this.isOnPatty = true;
			break;
		case "Grilled Jalapeno":
			this.isOnPatty = true;
			break;
			
		}
	}
	
	public boolean getIsOnTopBun(){
		return this.isOnTopBun;
	}
	
	public boolean getIsOnBottomBun(){
		return this.isOnBottomBun;
	}
	
	public boolean getIsOnPatty(){
		return this.isOnPatty;
	}
	
	public String getItemName(){
		return this.itemName;
	}
}
