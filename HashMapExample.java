package Chapter10;
import java.util.*;
public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer,String> students=new HashMap<>();
		students.put(1,"john");
		students.put(2, "alice");
		students.put(3, "David");
		students.put(2, "Bob");
		System.out.println(students);
		
		
	}

}
