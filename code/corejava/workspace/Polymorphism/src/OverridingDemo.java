
public class OverridingDemo {
	public static void main(String[] args) {
		Person p = new Doctor();
		p.introduction();
	}
}
class Person {
	protected int introduction() {
		System.out.println("Hello, I am a person..");
		return 0;
	}
}
class Doctor extends Person {
	public int introduction() {
		System.out.println("Hello, I am a Doctor...");
		return 0;
	}
}
class SoftwareDeveloper extends Person {
	public int introduction() {
		System.out.println("Hello, I am a Software Developer...");
		return 0;
	}
}
class Tester extends Person {
	public int introduction() {
		System.out.println("Hello, I am a Software Tester...");
		return 0;
	}
}