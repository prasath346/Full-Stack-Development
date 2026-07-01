package Chapter8;
import java.util.Scanner;
public class AddTwomatrix {
	 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] firstMatrix = new int[3][3];
    int[][] secondMatrix = new int[3][3];
    int[][] resultMatrix = new int[3][3];

    System.out.println("Enter First Matrix:");

    for(int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            firstMatrix[i][j] = scanner.nextInt();
        }
    }

    System.out.println("Enter Second Matrix:");

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            secondMatrix[i][j] = scanner.nextInt();
        }
    }

    System.out.println("\nResult Matrix:");

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            System.out.print(resultMatrix[i][j] + " ");
        }
        System.out.println();
    }

    scanner.close();

}

	
	}


