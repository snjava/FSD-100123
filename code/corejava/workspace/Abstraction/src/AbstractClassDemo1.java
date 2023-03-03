public class AbstractClassDemo1 {
	public static void main(String[] args) {
		Car car = new AudiA8EV();
		car.brand();
		car.noOfWheels();
		car.fual();
	}
}
abstract class Car {
	int a =0;
	public Car() {
		System.out.println("This is Car Class Constructure..");
	}
	abstract void brand(); // abstract method
	protected final static void noOfWheels() { // non-abstract method
		System.out.println("There are 4 wheels and 1 spare wheel");
	}
	public abstract void fual();
}

abstract class Audi extends Car {
	public void brand() {
		System.out.println("Brand : Audi");
	}
}

class AudiA8EV extends Audi
{
	public void fual() {
		System.out.println("Fual : Electric Vahical");
	}
}