
public class CreditCardExpDecorator implements IDisplayComponent, IKeyEventHandler {

	private CreditCardExp decoratedObject;
	
	public CreditCardExpDecorator(CreditCardExp c) {
		decoratedObject = c;
	}
	
	@Override
	public void key(String ch, int cnt) {
		
		if(cnt == 19)
			ch = "/" + ch;
		
		decoratedObject.key(ch, cnt);
		
	}

	@Override
	public void setNext(IKeyEventHandler next) {
		decoratedObject.setNext(next);
		
	}

	@Override
	public String display() {
		return decoratedObject.display();	
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
		decoratedObject.addSubComponent(c);
		
	}

}
