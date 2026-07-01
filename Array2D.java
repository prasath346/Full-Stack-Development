package Chapter8;

public class Array2D {

	public static void main(String[] args) {
		int[][]matrix= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}



