package abstract_.exam01;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		super(owner); //부모의 생성자가 어떠한 매개변수를 가지고있다면 super키워드를 통해서 매개변수를 넘겨줘야한다.
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
