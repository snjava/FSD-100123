/*
	*
	* *
	* * *
	* * * *
	* * * * *
*/


public class LoopDemo5
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=5 ; i++) // Row
		{ 
			for(int j=1 ; j<=i ; j++) // Column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}