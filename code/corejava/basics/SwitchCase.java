/**
	M- Monday
	T- Tuesday, Thursday
	W- Wednesday
	F- Friday
	S- Saturday, Sunday
	Other char: Invalid Day
*/

public class SwitchCase
{
	public static void main(String ar[])
	{
		char ch ='m';
		switch(ch)
		{
			case 'M':
			case 'm':
				System.out.println("Monday");
				break;
			case 'T':
				System.out.println("Tuesday or Thursday");
				break;
			case 'W':
				System.out.println("Wednesday");
				break;
			case 'F':
				System.out.println("Friday");
				break;
			case 'S':
				System.out.println("Saturday or Sunday");
				break;
			default:
				System.out.println("Invalid Character");
		}
		
	}
}