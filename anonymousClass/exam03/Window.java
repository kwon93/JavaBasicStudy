package anonymousClass.exam03;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnclickListener listener = new Button.OnclickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		btn1.setListener(listener);
		
		btn2.setListener(new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
				
			}
		});
	}
}
