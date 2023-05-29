package nested.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		CallListener call = new CallListener();
		TurnOn turnOn = new TurnOn();
		
		
		btn.setListener(call);
		btn.click();
		btn.setListener(turnOn);
		btn.click();
		
	}

}
