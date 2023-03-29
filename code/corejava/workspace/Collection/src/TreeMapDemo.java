import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(123, "Abc");
		map.put(13, "Prq");
		map.put(23, 23.54);
		map.put(12, false);
		map.put(113, null);
		map.put(1, "Abc");
		map.put(2, 111);
		map.put(123, "XYZ");
		System.out.println(map);
	}
}
