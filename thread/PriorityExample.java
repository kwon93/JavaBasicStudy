package thread;

public class PriorityExample {
	
	//getPriority(): Thread의 우선순위를 알려줌
	//setPriority(int setPriority): Thread의 우선순위를 지정한다.
	
	public static void main(String[] args) {
		
		Thread t1 = new ThreadEx3_1();
		
		Runnable r3 = new Thread3_2();
		Thread t2 = new Thread(r3);
		
		t2.setPriority(8);// Thread의 우선순위를 지정 1~10 클수록 우선순위가 큼
		//OS Scheduler가 우선순위를 참고해서 프로그램을 실행한다 
		
		System.out.println("priority of t1: "+t1.getPriority());
		System.out.println("priority of t2: "+t2.getPriority());
		t1.start();
		t2.start();
		
		
		
	}

}
class ThreadEx3_1 extends Thread{
	
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("0");
			for(int j = 0; j < 100000; j++) {
				//시간 지연용 for문
			}
		}
	}
	
}

class Thread3_2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("1");
			for(int j = 0; j < 100000; j++) {
				
			}
		}
	}
	
}