
public class InheritanceDemo {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println("a : " + ch.a);
		System.out.println("b : " + ch.b);
		ch.m1();
		ch.m2();
	}
}


class Parent
{
	int a = 10;
	public void m1() {
		System.out.println("I am from Parent class ");
	}
}

class Child extends Parent
{
	int b = 20;
	public void m2() {
		System.out.println("I am from Child class ");
	}
}