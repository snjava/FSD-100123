import java.util.Scanner;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int b = scan.nextInt();
		scan.close();
		
		System.out.println("Addition : " + (a + b));
		System.out.println("Multiplication : " + (a * b));
		try {
			int arr[] = {10,15,20};
			try {
				System.out.println(arr[a]);
			} catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Invalid Index...");
			}
			System.out.println("Division : " + (a / b));
		}
		catch(ArithmeticException ex) {
			System.out.println("Cannot Divide number by 0");
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
		catch (RuntimeException e) {
		}
		System.out.println("Substracation : " + (a - b));
		
	}
}
