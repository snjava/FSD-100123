public class FirstThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyThread th = new MyThread();
		th.setName("my-thread");
		th.setPriority(10); // must be between 1-10
		th.start(); // Thread become Ready for Execution
	}
}

class MyThread extends Thread {
	public void run() { // Assign a task to a thread
		System.out.println("This is my First Thread...");
		System.out.println(Thread.currentThread());
	}
}