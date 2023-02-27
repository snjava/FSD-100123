
public class FinalDemo {
	public static void main(String[] args) {
		CompanyDetails details = new CompanyDetails();
		System.out.println("Company Name " + details.name);
		details.policies();
	}
}

final class CompanyDetails {
	final String name = "Abc Pvt.Ltd.";
	final String contact = "9900998898";
	String locations = "Pune, Mumbai";
	final public void policies() {
		System.out.println("Company Policy");
	}
}