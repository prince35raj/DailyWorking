package demo.com;

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2];
		System.out.println("Enter array elements");
		for (int i = 0; i < 2; i++) // row
		{
			for (int j = 0; j < 2; j++) // columns
			{
				a[i][j] = sc.nextInt();
			}

		}
		System.out.println("matrix: \n");

		for (int i = 0; i < 2; i++) // row
		{
			for (int j = 0; j < 2; j++) // columns
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();

		}
	}

}
