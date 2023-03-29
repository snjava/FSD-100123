import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(123);
		set.add(13);
		set.add(23);
		set.add(12);
		set.add(11);
		set.add(123);
		set.add(3);
		set.add(23);
		System.out.println(set);
	}
}
