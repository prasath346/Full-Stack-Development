package Chapter8;
import java.util.Scanner;
public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= new int[3][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[1];
		System.out.println("enter the elements of jagged array:");
		for (int i=0;i< arr.length;i++) {
		for (int j=0;j<arr.length;j++) {
		arr[i][j]=sc.nextInt();
		}
		}
	
		System.out.println("Jagged array output:");
		for (int i=0;i< arr.length;i++) {
		for (int j=0;j< arr.length;j++) {
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
		}
			sc.close();
		}
}
		
		
