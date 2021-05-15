package Lab2;

import java.util.*;

public class Ex2sortString {
	public void sortStrings(String str1[]) {
		String temp;
		int a;
		for (int i = 0; i < str1.length; i++) {
			for (int j = i + 1; j < str1.length; j++) {
				if (str1[i].compareTo(str1[j]) > 0) {
					temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
		}
		System.out.print("Strings in Sorted Order: " + Arrays.toString(str1));

		System.out.println();
		System.out.println();

		if ((str1.length) % 2 == 0) {
			a = (str1.length) / 2;
			for (int k = 0; k < a; k++)
				System.out.println("Elements of array on left side: " + str1[k].toUpperCase());

			for (int n = a; n < str1.length; n++)
				System.out.println("Elements of array on right side : " + str1[n].toLowerCase());
		} else {
			a = ((str1.length) / 2) + 1;
			for (int k = 0; k < a; k++)
				System.out.println("Elements of array on left side : " + str1[k].toUpperCase());

			for (int n = a; n < str1.length; n++)
				System.out.println("Elements of array on right side : " + str1[n].toLowerCase());
		}
	}

	public static void main(String[] args) {
		int size = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array :");
		size = scan.nextInt();
		String str[] = new String[size];
		System.out.println("enter elements of array :");
		for (int i = 0; i < size; i++) {
			str[i] = scan.next();
		}
		for (int j = 0; j < size; j++)
			System.out.println("Elements of array : " + str[j]);

		scan.close();
		System.out.println();
		Ex2sortString ss1 = new Ex2sortString();
		ss1.sortStrings(str);
	}
}
