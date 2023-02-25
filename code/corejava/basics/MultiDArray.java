public class MultiDArray
{
	public static void main(String args[])
	{
		double percent[][]= {
										{76.78, 76.89, 98.56},
										{56,76, 78.76, 98.45, 55.66},
										{98.89, 76.67}
								};

			for(int r = 0 ; r<3 ; r++) {
				for(int c = 0 ; c < percent[r].length ; c++ ) {
					System.out.print(percent[r][c] + "\t");
				}
				System.out.println();
			}

	}
}