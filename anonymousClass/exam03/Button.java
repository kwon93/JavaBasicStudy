package anonymousClass.exam03;

public class Button {
	static interface OnclickListener{
		void onClick();
	}
	
	OnclickListener listener;

	void setListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	
}
