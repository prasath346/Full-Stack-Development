package Chapter10;
import java.util.LinkedList;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.addFirst("Start");
		list.addLast("end");
		System.out.println("list:"+list);
		list.removeFirst();
		list.removeLast();
		System.out.println("After removing first&last:"+list);
		System.out.println("first element:"+list.getFirst());
		System.out.println("last element:"+list.getLast());
	}
}
