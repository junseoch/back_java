package synchronizedTest;

// 동기화
public class ATM implements Runnable{
	int money = 10000;

	// 쓰레드가 작업 할 때마다 돈을 뺌
	// 쓰레드가 run에 달라붙어서 작업을 함
	
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			withdraw(1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
//			Thread.interrupted();
//			탈출 후 정상 종료
		}
	}
	
	public void withdraw(int money) {
		
		// 이 작업을 완료될 때까지 중지시킴
		// synchronized(객체)
		synchronized (this) {			
			this.money -= money;
		}
		
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		System.out.println("현재 잔액: " + this.money + "원");
	}
	
	
}
