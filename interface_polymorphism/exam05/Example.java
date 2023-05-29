package interface_polymorphism.exam05;

public class Example {

	public static void main(String[] args) {
		IplementationC c = new IplementationC();
		
		InterfaceA iA = c; 
		iA.methodA(); 
		InterfaceB iB = c;
		iB.methodB();
		InterfaceC iC = c; // 상속받은 메소드까지 다 실행가능.
		iC.methodA();
		iC.methodB();
		iC.methodC();
	}

}
