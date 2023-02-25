public class CommandLineArgs {
	public static void main(String arg[]) {
		System.out.println("Command Line Arguments are : ");
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		System.out.println(arg[2]);

		int num1 = Integer.parseInt(arg[1]);
		int num2 = Integer.parseInt(arg[2]);

		System.out.println(num1 + num2);
		
	}
}