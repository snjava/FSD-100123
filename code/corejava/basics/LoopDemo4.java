/*
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
*/


public class LoopDemo4
{
	public static void main(String args[])
	{
		for(int r=1 ; r<=3 ; r++) // Row
		{ 
			for(int c=1 ; c<=5 ; c++) // Column
			{
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
}