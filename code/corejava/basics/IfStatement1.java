/**
	0-17: Kids Age
	18-60: Adult Age
	60-120: Old Age
*/

public class IfStatement1
{
	public static void main(String ar[])
	{
		int age = 77;
		if(age>=0 && age<=120)
		{
			System.out.println("Valid Age");
		
			if(age>=0 && age<=17) {
				System.out.println("Kids Age");	
			}
			else if(age>=18 && age<60) {
				System.out.println("Adult Age");
			}
			else {
				System.out.println("Old Age");
			}
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}
}