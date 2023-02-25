public class Array1DDemo
{
	public static void main(String args[])
	{
		double percent[];  // declaration of array
		percent = new double[6]; // Instantiation of Array
		percent[0] = 67.76; // initialization of array
		percent[2] = 71.66;
		percent[4] = 87.78;
		percent[1] = 64.98;
		percent[3] = 54.19;
		percent[5] = 83.90;

		for(int i=0 ; i<=5 ; i++) {
			System.out.println(percent[i]);
		}
	}
}