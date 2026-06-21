package Example;
import java.util.Scanner;
public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter student name:");
		String name = sc.nextLine();
		System.out.print("enter student maarks:");
		int marks=sc.nextInt();
		System.out.println("\nstuent Details");
		System.out.println("name:"+name);
		System.out.println("Marks:+marks");
		sc.close();
		

	}

}
