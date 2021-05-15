package Lab1;

import java.util.Scanner;

public class Ex6Difference {
	public int calculatedifference(int n) {
		int sum = 0, sum1 = 0, diff;
		int input = n;
		while (n > 0) {
			int t = n % 10;
			int k = t * t;
			System.out.println("square of " + t + " is " + k);
			n = n / 10;
			sum = sum + k;
		}
		System.out.println("sum of square of digits is :" + sum);
		while (input > 0) {
			int t = input % 10;
			sum1 = sum1 + t;
			input = input / 10;
		}
		int k = sum1 * sum1;
		System.out.println("square of sume of first n natural numbers :" + k);
		diff = sum - k;
		return diff;
	}

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter number ");
		num = scan.nextInt();
		scan.close();
		Ex6Difference sn1 = new Ex6Difference();
		int diff1;
		diff1 = sn1.calculatedifference(num);
		System.out.println(
				"Difference of sum of square of digits and square of sum of first n natural numbers is : " + diff1);

	}

}
