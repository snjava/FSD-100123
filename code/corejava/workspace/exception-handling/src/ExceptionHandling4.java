import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling4 {
	public static void main(String[] args) {
		try {
			readFile("test.txt");
		} catch(Exception ex) {
			ex.printStackTrace(); // used to print all details of the exception.
		}
	}
	
	
	public static void readFile(String fileName) throws FileNotFoundException, ArithmeticException  {
		FileReader read = new FileReader(fileName);
	}
}
