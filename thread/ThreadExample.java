package thread;


public class ThreadExample {

	public static void main(String[] args) {
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
		
		
		
		t1.start(); //  두 개의 쓰레드가 기능을 구현한다. 
		t2.start(); // 0 과 1이 출력되는 순서가 매번 다름
		//먼저 start한다고 먼저 실행되는것이 아니라
		//컴퓨터의 OS의 스케줄러가 실행 순서를 결정한다.
		
		/*
		 * start(): 새로운 호출 스택을 생성 내가 구현한 ThreadEx1_1의 run() 를 호출한 뒤
		 * start()는 스택에서 사라진다. 
		 * 
		 * start() 메서드
		 * 새로운 호출 스택을 생성했기 때문에 서로 독립적인 작업을 수행할 수 있게 만들어준다.
		 * 
		 * */
		
		
	}

}
// 첫번째 방법 : Thread Class를 직접 상속받아서 구현
class ThreadEx1_1 extends Thread{ 
	public void run() { // run()이란 Thread가 수행할 작업
		for(int i=0; i<500; i++) {
			System.out.print(0);
		}
	}
}

// 두번째 방법: Runnable Interface를 구현해서 Thread를 구현
class ThreadEx1_2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print(1);
		}
		
	}
	
}