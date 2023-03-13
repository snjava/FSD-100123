import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Start of Main Method");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int b = scan.nextInt();
		
		System.out.println("Division : " + (a/b));
		
		System.out.println("End of Main Method");
	}

}
