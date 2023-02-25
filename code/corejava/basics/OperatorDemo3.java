public class OperatorDemo3
{
	public static void main(String args[])
	{
		int a = 10;
		int b =20;
		++a;  // a = a + 1;   a += 1
		System.out.println(a);  // 11

		--b;  // b = b - 1;   b -= 1
		System.out.println(b);  // 19


		int x = 20;
		int y = ++x; //pre incrment		
		System.out.println(y);  // 21
		System.out.println(x);  // 21

		int z = x--; // post decrement
		System.out.println(z);  // 21
		System.out.println(x);  // 20
	}
}