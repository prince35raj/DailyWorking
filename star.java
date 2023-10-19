package demo.com;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr pattren");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			for (int j = i; j < i; j++) {
				if (j % 3 == 1) {
					System.out.print("#");
				}

				else if (j % 3 == 2) {
					System.out.print("$");
				} else if (j % 3 == 0) {
					System.out.print("*");
				}

			}

		}
		System.out.println();
	}

}
