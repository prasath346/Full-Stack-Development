package Chapter10;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add(1,"Grapes");
		System.out.println("list:+"+list);
		System.out.println("Element at index2:"+list.get(2));
		list.remove("Banana");
		System.out.println("After removing Banana:"+list);
		list.set(1,"orange");
		System.out.println("After set:"+list);
		System.out.println("Size:"+list.size());
	}

}
