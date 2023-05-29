package nested.exam04;
//로컬클래스에서 접근 제한
public class Outter {
	public void method1(int arg) {
		int localVariable = 1;
		
		
		class inner{ //로컬클래스
			void method() {
				int result = arg + localVariable;
				//로컬 클래스에서 매개변수,로컬변수를 사용하게될 경우 매개변수는 final 속성을 가지게 된다.
			}
		}
	}
}
