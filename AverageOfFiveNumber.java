package Example;

import java.util.Scanner;

public class AverageOfFiveNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number:");
		double n1= sc.nextDouble();
		System.out.print("Enter the second number:");
		double n2=sc.nextDouble();
		System.out.print("Enter the third number:");
		double n3=sc.nextDouble();
		System.out.print("Enter the fourth number:");
		double n4=sc.nextDouble();
		System.out.print("Enter the fifth number:");
		double n5=sc.nextDouble();
		Double average = (n1+n2+n3+n4+n5)/5;
		System.out.println("Average="+average);
		sc.close();
	}

}
