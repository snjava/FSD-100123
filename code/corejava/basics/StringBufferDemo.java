public class StringBufferDemo {
	public static void main(String arg[]) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb); // Hello
		sb.append(" Java");	   
		System.out.println(sb); // Hello Java
		sb.insert(5 ," welcome To");
		System.out.println(sb); // Hello welcome To Java
		sb.reverse();
		System.out.println(sb); // avaJ oT emoclew olleH
		System.out.println(sb.length());
	}
}