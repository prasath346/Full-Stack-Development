package Example;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter student name:");
		String name=sc.nextLine();
		System.out.print("Enter student marks:");
		int marks= sc.nextInt();
		System.out.println("Student name:"+name);
		System.out.println("student marks:"+marks);
		

	}

}
