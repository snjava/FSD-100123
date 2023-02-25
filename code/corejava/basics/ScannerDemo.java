import java.util.Scanner;
public class ScannerDemo {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.next();

		System.out.println("Enter Num1 : ");
		int num1 = scan.nextInt();

		System.out.println("Enter Num2 : ");
		double num2 = scan.nextDouble();

		System.out.println("Your Name is : " + name);
		System.out.println("Add : " + (num1+num2));

	}
}