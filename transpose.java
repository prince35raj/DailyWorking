package demo.com;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {

		int i, j;

		System.out.println("Enter value for row and column");

		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();

		int colm = sc.nextInt();

		int a[][] = new int[row][colm];

		System.out.print("Enter element for matrix");

		for ( i = 0; i < row; i++)

		{

			for ( j = 0; j < colm; j++)

			{

				a[i][j] = sc.nextInt();

			}

		}

		for (i = 0; i < row; i++)

		{

			for (j = 0; j < colm; j++)

			{

				System.out.print(a[i][j] + " ");

			}

			System.out.println();

		}

		System.out.println("Matrix after transposation");

		for ( i = 0; i < colm; i++)

		{

			for (j = 0; j < row; j++)

			{

				System.out.print(a[j][i] + " ");

			}

			System.out.println();

		}

	}

}
