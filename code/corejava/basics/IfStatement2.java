/**
	M- Monday
	T- Tuesday, Thursday
	W- Wednesday
	F- Friday
	S- Saturday, Sunday
	Other char: Invalid Day
*/

public class IfStatement2
{
	public static void main(String ar[])
	{
		char ch ='C';

		if(ch == 'M') {
			System.out.println("Monday");
		}	
		else if(ch == 'T') {
			System.out.println("Tuesday or Thursday");
		}
		else if(ch == 'W') {
			System.out.println("Wednesday");
		}
		else if(ch == 'F') {
			System.out.println("Friday");
		}
		else if(ch == 'S') {
			System.out.println("Saturday Or Sunday");
		} 
		else {
			System.out.println("Invalid Character...");
		}
	}
}