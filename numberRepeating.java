package demo.com;

import java.util.Scanner;

public class numberRepeating {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			count = 1;
			if (a[i] != -1) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {
						count = count + 1;
						a[j] = -1;
					}
				}
				b[i] = count;
			}

		}
		for (int i = 0; i < n; i++) {
			if (a[i] != -1) {
				System.out.println(a[i] + " " + b[i]);
			}
		}

	}
}
