package thread;

// Synchronized: 동기화, 진행중인 작업이 다른 쓰레드에게 간섭받지않게 영역화 하는것.
// 한개에 한 쓰레드만 임계영역에 들어갈 수 있기 때문에 동기화는 최소화해야한다.
public class SynchronizedExample {

	public static void main(String[] args) {
		Runnable r1 = new RunnableEx2();
		new Thread(r1).start();
		new Thread(r1).start();
		
		//동기화를 안했다면 잔고가 -값이 나오게 된다.
		//왜냐, 한 영역에 두 개의 쓰레드가 간섭하게되어 if문을 같이 통과해 작업이 실행되기 때
		//그래서 동기화를통해 한 메소드에 영역화를 진행해 하나의 쓰레드만이 들어와 작업을 처리하게 만들었다.
	}

}
class Account{
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	//synchronized Keyword를 붙여 동기화 영역 생성 
	public synchronized void withdraw(int money) { 
		if(balance >= money) {
			try { Thread.sleep(1000); 
			//동기화를 안했다면 A쓰레드가 슬립할 때 B메소드가 if문을 true로 통과하게 된다.
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}
}

class RunnableEx2 implements Runnable{
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			
			int money = (int)(Math.random()* 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("Balance: "+acc.getBalance());
		}
	}
	
}
