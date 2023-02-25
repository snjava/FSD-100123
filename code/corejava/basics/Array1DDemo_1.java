public class Array1DDemo_1
{
	public static void main(String args[])
	{
		int value[] = {54,67,65,3,76,87,53,657,87,5,3,46,879,35};

		System.out.println(value.length); // to get the total number of values
		System.out.println(value.length-1); 

		System.out.println("------------------");
		for(int i = 0 ; i<value.length ; i++) {
			System.out.println(value[i]); 
		} 	
	}
}