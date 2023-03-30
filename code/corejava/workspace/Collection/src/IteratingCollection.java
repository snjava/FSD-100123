import java.util.ArrayList;
import java.util.Iterator;

public class IteratingCollection {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(234);
		list.add(23);
		list.add(24);
		list.add(3);
		list.add(4);
		list.add(27);
		list.add(212);

		int eventCount = 0;
		int oddCount = 0;
		for(int val : list) {
			if (val % 2 == 0) {
				eventCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Event Numbers : " + eventCount);
		System.out.println("Odd Numbers : " + oddCount);
		System.out.println("================================================");
		
		eventCount = 0;
		oddCount = 0;
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int val = it.next();
			if (val % 2 == 0) {
				eventCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Event Numbers : " + eventCount);
		System.out.println("Odd Numbers : " + oddCount);
	}
}
