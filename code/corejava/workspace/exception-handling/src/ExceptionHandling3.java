import java.io.IOException;
import java.util.Scanner;


public class ExceptionHandling3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Contact Number : ");
		String number = scan.next();
		
		try {
			if(number.length()!=10) { // identification of exception scenario
				//throw new IllegalArgumentException("Please enter valid contact number..!!!"); // throw unchecked exception
				//throw new IOException("Please enter valid contact number..!!!"); // throw checked exception
				throw new InvalidUserInputException(); // throw custom exception.
			}
			
			System.out.println("Your Contact Number : " + number);
			
		} catch(InvalidUserInputException ex) {
			ex.printError();
		}
		scan.close();
		
		
	}
}
