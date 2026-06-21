package Example;

public class LargestOfThree {

	public static void main(String[] args) {
		int a=25;
		int b=40;
		int c=15;
		if(a>=b && a>=c) {
			System.out.println("largest number="+a);
		}else if (b >= a&& b >=c) {
			System.out.println("largest number="+b);
		}else {
			System.out.println("largest number="+c);
			
		}

	}

}
