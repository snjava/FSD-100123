
public class ThreadSleepJoin {
	public static void main(String[] args) {
		System.out.println("Main Thread STARTED");
		SleepJoinThread th = new SleepJoinThread();
		th.start();
		
		try {
			th.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i =1; i<=10 ; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("Main Thread ENDS");
	}
}

class SleepJoinThread extends Thread {
	public void run() {
		System.out.println("SleepJoin Thread STARTED");
		
		for(int i =1 ; i<7; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print("* ");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		
		System.out.println("SleepJoin Thread ENDS");
	}
}