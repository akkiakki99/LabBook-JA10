package Lab1;

import java.util.Scanner;

public class Ex4Primenum {
	public void primenum(int num) {
		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= 10; j++) {
				if (i % j == 0)
					count++;
				else
					continue;
			}
			if (count > 2)
				System.out.println(i + " IS NOT PRIME");
			else
				System.out.println(i + " IS PRIME");
		}

	}

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter number ");
		num = scan.nextInt();
		scan.close();
		Ex4Primenum pn = new Ex4Primenum();
		pn.primenum(num);

	}

}
