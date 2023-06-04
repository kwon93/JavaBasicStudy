package thread;

public class ThreadJoinExample {

	static long startTime = System.currentTimeMillis();
	public static void main(String[] args) {
		
		ThreadEx2_1 t1 = new ThreadEx2_1();
		
		Runnable r2 = new ThreadEx2_2();
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join(); // main Thread가 t1의 작업이 끝날때 까지 대기
			t2.join();// main Thread가 t2의 작업이 끝날때 까지 대기
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("소요시간: "+ (System.currentTimeMillis()- startTime));
		
		
		
	}

}

class ThreadEx2_1 extends Thread{
	public void run() {
		for(int i = 0; i < 200; i++) {
			System.out.print("0");
		}
	}
}

class ThreadEx2_2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 200; i++) {
			System.out.print("1");
		}
	}
	
}
