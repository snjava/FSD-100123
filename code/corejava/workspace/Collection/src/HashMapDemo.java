import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put("Abc", 123);
		map.put(12.34, 'A');
		map.put("Abc", 666);
		map.put("Xyz", 123);
		map.put(111, "Abc");
		map.put("Pqr", 56.87);
		map.put(true, false);
		map.put(null, 123);
		map.put(555, null);
		System.out.println(map);
		System.out.println(map.containsKey("Abc"));
		System.out.println(map.containsValue("Abc"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		map.remove("Abc");
		map.remove("Abc", 123);
		System.out.println(map);
		System.out.println(map.get(12.34)); 
		
		
	}

}
