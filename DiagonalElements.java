package Chapter8;
import java.util.Scanner;
public class DiagonalElements {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int[][] matrix = new int[3][3];

	        System.out.println("Enter 9 elements:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("\nDiagonal Elements:");

	        for (int i = 0; i < 3; i++) {
	            System.out.println(matrix[i][i]);
	        }

	        scanner.close();
	    }
	

	}


