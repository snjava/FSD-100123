
public class ConstrcutorDemo1 {
	public static void main(String[] args) {
		
		Product p1 = new Product(121, "Smart Phone");
		System.out.println("Id : " + p1.id); // 0
		System.out.println("Name : " + p1.name); // NA
		System.out.println("Desc : " + p1.desc); // NA
		
		Product p2 = new Product();
		Product p3 = new Product(123, "Smart TV", "Andrio TV");
	}
}

class Product {
	int id;
	String name;
	String desc;

	// No parameter constructor.
	public Product() {
		name = "NA";
		desc = "NA";
	}

	// parameterized constructor
	public Product(int i, String n, String d) {
		id = i;
		name = n;
		desc = d;
	}

	// parameterized constructor
	public Product(int i, String n) {
		id = i;
		name = n;
		desc = "NA";
	}
}
