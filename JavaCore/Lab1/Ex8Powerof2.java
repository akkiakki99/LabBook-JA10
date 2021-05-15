package Lab1;

import java.util.Scanner;

public class Ex8Powerof2 {
	public static boolean checkNumber(int n) {
		int m = n;
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			System.out.println(m + " is power of 2 :");
			return true;
		} else {
			System.out.println(n + " is not power of 2 :");
			return false;
		}
	}

	public static void main(String[] args) {
		int num;
		boolean a;
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter number : ");
		num = scan.nextInt();
		scan.close();
		a = Ex8Powerof2.checkNumber(num);
		System.out.println(num + " is power of two :" + a);
	}

}
