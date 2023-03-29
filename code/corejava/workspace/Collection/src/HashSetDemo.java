import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(234);
		set.add("Abc");
		set.add(23.4);
		set.add('A');
		set.add(234);
		set.add("Abc");
		set.add(true);
		System.out.println(set);
	}

}
