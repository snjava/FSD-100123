
public class ConstrcutorDemo2 {
	public static void main(String[] args) {
		C3 c3 = new C3();
	}
}

class C1 {
	public C1() {
		super();
		System.out.println("C1 no Parameter Constructor.");
	}
}

class C2 extends C1 {
	public C2() {
		super();
		System.out.println("C2 no Parameter Constructor.");
	}
}

class C3 extends C2{
	public C3() {
		super();
		System.out.println("C3 no Parameter Constructor.");
	}
}
