
public class InterfaceDemo1 {
	public static void main(String[] args) {

	}
}

interface Vehicle {
	int x = 10;   // public static final int x = 10;
	void brand(); // public abstract void brand();
	void fual();
	void noOfWheels();
}

abstract class Car1 implements Vehicle {
	public void noOfWheels() {
		System.out.println("Car has 4 Wheels");
	}
}

// AnduA8 IS-A Vehicle
class AudiA8 implements Vehicle {
	public void brand() {
		System.out.println("Brand: Audi");
	}
	public  void fual() {
		System.out.println("Fual: Petrol");
	}
	public void noOfWheels() {
		System.out.println("4 Wheels");
	}
}