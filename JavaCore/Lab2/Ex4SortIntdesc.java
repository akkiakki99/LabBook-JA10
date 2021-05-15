package Lab2;

import java.util.*;

public class Ex4SortIntdesc {
	public void modifyarray(int a[], int n) {
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j] = a[i];
				j++;
			}
		}

		temp[j++] = a[n - 1];

		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}

		for (int m = 0; m < a.length; m++)
			System.out.print("  " + a[m]);

		Arrays.sort(a);

		System.out.println();
		System.out.print("Arrays in Sorted Order: " + Arrays.toString(a));
	}

	public static void main(String[] args) {
		int size = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array :");
		size = scan.nextInt();
		int a[] = new int[size];
		System.out.println("enter elements of array :");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		for (int j = 0; j < size; j++)
			System.out.print("  " + a[j]);

		System.out.println();
		scan.close();

		Ex4SortIntdesc sd = new Ex4SortIntdesc();
		sd.modifyarray(a, size);

	}
}
