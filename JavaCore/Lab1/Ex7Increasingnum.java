package Lab1;

import java.util.Scanner;

public class Ex7Increasingnum {
	public void checkNumber(int n) {
		int b = Integer.toString(n).length();
		int a[] = new int[b];
		int input = n;
		while (input > 0) {
			for (int i = 0; i < b; i++) {
				int t = input % 10;
				a[i] = t;
				input = input / 10;
			}
		}
		int count = 0;
		for (int j = 0; j < b - 1; j++) {
			if (a[j] > a[j + 1])
				count++;
		}
		if (count >= b - 1)
			System.out.println("Increasing number");
		else
			System.out.println("Not increasing number");
	}

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter number ");
		num = scan.nextInt();
		scan.close();
		Ex7Increasingnum i1 = new Ex7Increasingnum();
		i1.checkNumber(num);
	}

}
