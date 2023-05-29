package interface_.exam05;

public class MyClassExample {

	public static void main(String[] args) {

		System.out.println("1)-------------------------");
		
		MyClass c1 = new MyClass();
		
		c1.rc.turnOn();
		c1.rc.setVolume(10); //Myclass 의 필드값으로 사용된 텔레비젼의 객체의 메소드가 호출된다.
		
		

		System.out.println("2)-------------------------");
		
		MyClass c2 = new MyClass(new Audio()); 
		//생성자의 매개변수를 통해 기본생성자가 가진 메소드를 호출한다.
		

		System.out.println("3)-------------------------");
		
		MyClass c3 = new MyClass();
		c3.methodA(); // 메소드의 로컬변수인 오디오의 메소드가 호출된다.
		

		System.out.println("4)-------------------------");

		MyClass c4 = new MyClass();
		c4.methodB(new Television());
		//매개변수에 텔레비젼객체가 담겨 텔레비전의 메소드가 호출된다.
		
		
				
	}

}
