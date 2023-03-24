import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		//int arr[] = {234,345,57,457,34,34,546};
		//List lst = Arrays.asList(arr);
		
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("Abc");
		list.add(12.3);
		list.add('A');
		list.add("Abc");
		list.add(true);
		list.add(123);
		
		System.out.println(list);
		list.remove("Abc");
		System.out.println(list);
		System.out.println(list.contains("Abc"));
		//list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		ArrayList l1 = new ArrayList();
		l1.add(333);
		l1.add(666);
		l1.add("AAA");
		
		list.addAll(l1);
		System.out.println(list);
		
		list.add(1, "Xyz");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.get(5));
		
		list.set(3, "PQR");
		System.out.println(list);
		
	}
}
