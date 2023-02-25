public class StringDemo1 {
	public static void main(String args[]) {
		String str1 =  new String("Hello");
		String str2 =  "Hello";
		String str3 =  new String("Hello");
		String str4 =  "Hello";
	
		System.out.println(str1); // Hello
		System.out.println(str2); // Hello
		System.out.println(str3); // Hello
		System.out.println(str4); // Hello

		System.out.println(str1 == str2); // false
		System.out.println(str2 == str4); // true
		System.out.println(str2 == str3); // false
		System.out.println(str1 == str4); // false 
		System.out.println(str4 == str2); // true
	}
}