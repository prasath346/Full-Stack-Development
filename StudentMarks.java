package Chapter9;
import java.util.Scanner;
class InvalidMarksException extends Exception{
	InvalidMarksException(String msg){
		super (msg);
	}
}
class FailException extends Exception{
	FailException(String msg) {
		super(msg);
	}
}
public class StudentMarks {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter marks 1:");
			int m1=sc.nextInt();
			System.out.print("Enter mark 2:");
			int m2=sc.nextInt();
			System.out.print("Enter mark 3:");
			int m3=sc.nextInt();
		}
	}

}
