package Chapter9;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3};
			System.out.println(arr[5]);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index!");
		}
		catch(Exception e) {
			System.out.println("Somthing went wrong");
		}
	}
}
