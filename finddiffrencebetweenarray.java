package demo.com;

import java.util.Scanner;

public class finddiffrencebetweenarray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arrays size");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enetr Array element");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++)
				if (array[i] > array[j]) {
					int p = array[i];
					array[i] = array[j];
					array[j] = p;

				}

		}
		System.out.println(array[n - 1] - array[0]);
		System.out.println(array[1] - array[0]);

	}

}
