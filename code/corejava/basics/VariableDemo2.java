public class VariableDemo2
{
	public static void main(String args[])
	{
		byte x = 10;
		int y = x; // Implicit Casting
		System.out.println(y);

		int a = 10;
		byte b = (byte) a; // explicit casting
		System.out.println(b);
	
	}
}