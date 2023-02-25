public class IfStatement
{
	public static void main(String ar[])
	{
		double percent = 17.56;
		
		if(percent>=40 && percent<=100) 
		{
			System.out.println("Congrates..!! You are pass...");
		}
		else if(percent>=0 && percent<40)
		{
			System.out.println("Sorry..!! You are fail...");
		}
		else
		{
			System.out.println("Percent value is Invalid...");
		}
	}
}