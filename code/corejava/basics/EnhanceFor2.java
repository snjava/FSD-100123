public class EnhanceFor2
{
	public static void main(String args[])
	{
		int arr[][] = {{34,45,56,76},{23,32,56},{32,45}};
		
		for(int r[] : arr)  // Row
		{
			for(int val : r) // Column
			{
				System.out.print(val + "\t");
			}
			System.out.println();
		}
	}
}