package thread;
// demonThread : 일반 Thread의 보조역할 
public class DemonThreadExample implements Runnable{
	static boolean autosave = false;

	public static void main(String[] args) {
		
		Thread t = new Thread(new DemonThreadExample());
		t.setDaemon(true);
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
			
			if(i == 5) autosave = true;
		}
		
		
	}
	
	public void run() {
		while(true) { //무한루프로 설정한다. 일반 Thread가 종료되면 자동 종료된다.
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {}
			
			if(autosave) autosave();
			
		}
	}
	
	public void autosave() {
		System.out.println("작업파일이 자동 저장 되었습니다.");
	}

}
