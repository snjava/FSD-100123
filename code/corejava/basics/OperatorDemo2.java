public class OperatorDemo2
{
	public static void main(String args[])
	{
		int a = 20;
		int b = 4;
		int c = 3;
		double d = 3;
		char ch = 'A';

		ch += 5;   // ch = (char)(ch + 5);
		System.out.println(ch);

		a /= c;   // a = a / c;
		b -= c;   // b = b - c;
		System.out.println(a);
		System.out.println(b);	
	} 
}