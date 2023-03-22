class Printer {
	public void print(String val) {
		System.out.println(val);
	}
}
public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread1 t1 = new Thread1(printer);
		Thread2 t2 = new Thread2(printer);
		t1.start();
		t2.start();
	}
}
class Thread1 extends Thread {
	Printer printer;
	Thread1(Printer printer) {
		this.printer = printer;
	}
	public void run() {
		synchronized(printer) {
			for(int i = 1; i<=10 ; i++) {
				printer.print("12 * " + i + " = " + (12*i));
				try {
					if(i==4) {
						printer.wait();
					}
					Thread.sleep(2000);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}
class Thread2 extends Thread {
	Printer printer;
	Thread2(Printer printer) {
		this.printer = printer;
	}
	public void run() {
		synchronized(printer) {
			for(int i = 1; i<=10 ; i++) {
				printer.print("i = " + i);
			}
			printer.notifyAll();
		}
	}
}



