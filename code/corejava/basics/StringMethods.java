public class StringMethods {
	public static void main(String args[]) {
		String s1 = " Welcome ";
		System.out.println(s1);// Welcome
		String str1 = s1.toUpperCase();  // WELCOME
		System.out.println(str1); // WELCOME
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		String s2 = "";
		System.out.println(s2.isEmpty());
		
		String s3 = "Hello";
		System.out.println(s3.charAt(2));
		System.out.println(s3.indexOf('e'));
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(1,4));

		String s4 = s3.concat(s1);
		String s5 = s3 + s1;
		System.out.println(s4);
		System.out.println(s5);

		String s6 = "Test";
		String s7 = new String("Test");
		String s8 = new String("TEST");
		System.out.println(s6 == s7);
		System.out.println(s6.equals(s7));
		System.out.println(s6.equalsIgnoreCase(s8));

		String s9 = "Hello";
		char ch[] = s9.toCharArray();
		int count = 0;
		for(char c : ch) {
			if(c == 'l') {
				count++;
			}
		}
		System.out.println("count of 'l' : " + count);
	}
}




