public class ThisKeyword {
	public static void main(String[] args) {
		Product p1 = new Product("Smart TV", 35000, 3);
		Product p2 = new Product("Smart Mobile", 15000);
		p1.totalPrice();
		p2.totalPrice();
	}
}

class Product {
	String name;
	double price;
	int qty;
	public Product(String n, double p, int q) {
		name = n;
		price = p;
		qty = q;
	}
	public Product(String n, double p) {
		this(n, p, 1); // access constructor of same class
	}
	public void totalPrice() {
		int qty = 5;
		System.out.print("Name: " + name);
		System.out.println(" Total Price : " + (price*this.qty)); // variable of same class
		this.test(); // access method of same class
	}
	public void test() {
		System.out.println("===========Test=============");
	}
	
}
