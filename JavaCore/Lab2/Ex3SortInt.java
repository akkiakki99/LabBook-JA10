package Lab2;

import java.util.*;

public class Ex3SortInt {
	public void getSorted(int a[]) {
		int temp, start, end;
		start = 0;
		end = a.length - 1;

		while (start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		for (int j = 0; j < a.length; j++)
			System.out.print("  " + a[j]);

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

		Ex3SortInt si = new Ex3SortInt();
		si.getSorted(a);

	}
}
