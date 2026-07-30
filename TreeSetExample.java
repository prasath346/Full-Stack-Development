package Chapter10;
import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(50);
		ts.add(10);
		ts.add(40);
		ts.add(20);
		ts.add(30);
		System.out.println("TreeSet(sorted):"+ts);
		System.out.println("First:"+ts.first());
		System.out.println("Last:"+ts.last());
	}
}
