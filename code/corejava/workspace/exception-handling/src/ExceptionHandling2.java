import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		int arr[] = {56,34,6,0,12,65,0};
		Scanner scan =new Scanner(System.in);
		
			try {
				FileReader read = new FileReader("D:\\test.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	
		
		try {
			System.out.println("Enter 1st Index : ");
			int index1 = scan.nextInt();
			System.out.println("Enter 2nd Index : ");
			int index2 = scan.nextInt();
			int val1 = arr[index1];
			int val2 = arr[index2];
			System.out.println("Division is : " + (val1/val2));
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException ex) { // Java 1.7 onwards
			System.out.println("Something went wrong try after sometime");
		}
		catch(Exception ex) {
			System.out.println("Something went wrong try after sometime");
		}
		finally {
			scan.close();
		}
	}
}