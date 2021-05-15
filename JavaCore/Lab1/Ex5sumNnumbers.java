package Lab1;

import java.util.Scanner;

public class Ex5sumNnumbers {
	public int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter number ");
		num = scan.nextInt();
		scan.close();
		Ex5sumNnumbers sn1 = new Ex5sumNnumbers();
		int sum1;
		sum1 = sn1.calculateSum(num);
		System.out.println(" Sum of first n natural numbers which are divisible by 3 or 5 is : " + sum1);

	}

}
