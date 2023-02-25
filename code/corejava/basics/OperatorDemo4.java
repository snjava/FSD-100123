public class OperatorDemo4
{
	public static void main(String args[])
	{
		int a = 5;
		int b = 2;
		int c = 5;

		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(a == c); // true
		System.out.println(a != c); // false
		System.out.println(a <= c); // true
		System.out.println(a >= b); // ture

		System.out.println(a>1 & a<10); // true & true = true
		System.out.println(a>1 | a<10); // true | true = true
	
		System.out.println(a & b); // 0101 & 0010 = 0000 (0)
/*
			0	1	0	1 
		& 	0	0	1	0
		------------------
			0	0	0	0
*/

		System.out.println(a | b); // 0101 | 0010 = 0111 (7)
/*
			0	1	0	1 
		| 	0	0	1	0
		------------------
			0	1	1	1
*/





	}
}
