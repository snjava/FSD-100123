import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("Abc");
		list.add(12.3);
		System.out.println(list);
		
		list.addFirst(444);
		System.out.println(list);
		
		list.push(999);
		System.out.println(list);
		
		System.out.println(list.removeFirst());
		System.out.println(list);
		
		System.out.println(list.pop());
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list);
		
		list.addLast(555);
		System.out.println(list);
		
		System.out.println(list.removeLast());
		System.out.println(list);
		
		System.out.println(list.remove(1));
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}

}
