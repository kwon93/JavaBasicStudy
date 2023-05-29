package nested.exam06;
//중첩 인터페이스 구현
public class CallListener implements Button.onClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
