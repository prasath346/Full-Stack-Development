package Chapter10;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Orange");
		hs.add("Apple");
		System.out.println("HashSet:"+hs);
		System.out.println("Contains banana?"+hs.contains("Banana"));
		System.out.println("Size:"+hs.size());

	}

}
