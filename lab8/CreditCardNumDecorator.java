
public class CreditCardNumDecorator implements IKeyEventHandler, IDisplayComponent{

	private CreditCardNum decoratedObject;
	
	public CreditCardNumDecorator(CreditCardNum c) {
		decoratedObject = c;
	}

	@Override
	public void key(String ch, int cnt) {
		if(!"X".equals(ch)) {
			if(cnt <= 16 && cnt != 1 && cnt % 4 == 1)
				ch = " " + ch;
		}
		
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
