public class OperatorDemo1
{
	public static void main(String args[])
	{
		int a = 20;
		int b = 4;
		int c = 3;
		double d = 3;
		char ch = 'A';
		int add = a + b + c;
		System.out.println(add);      // 27
		System.out.println(a - b - c);// 13
		System.out.println(a * c);		// 60
		System.out.println(a / d);		// 6.66666667
		System.out.println(a % c);		// 2
		ch = (char)(ch + 5);
		System.out.println(ch);
	} 
}