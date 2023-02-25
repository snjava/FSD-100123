public class OperatorDemo5
{
	public static void main(String ar[])
	{
		int a = 11;
		int b = 5;
		int c = 10;

		System.out.println(a<10 & a>1);	// false
		System.out.println(a<10 && a>1);	// false

		int value = a>10 ? 1 : -1;
		System.out.println(value);	// 1
		
	}
}