public class EnhanceFor1
{
	public static void main(String args[])
	{
		int arr1[] = {34,45,56,76,54,5,67,86};
		System.out.println("-------For--------");
		for(int i = 0; i<arr1.length ; i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("-------EnhanceFor--------");
		for(int val : arr1) 
		{
			System.out.println(val);
		}
		
	}
}