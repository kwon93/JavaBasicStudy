package nested.exam06;
//중첩 인터페이스
public class Button {
	onClickListener listener;
	
	void setListener(onClickListener listener) {
		this.listener = listener;
		
	}
	
	void click() {
		listener.onClick();
	}
	
	static interface onClickListener{
		void onClick();
	}
	
	
}
