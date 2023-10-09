package demo.com;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total rows:");
		int rows = sc.nextInt();

		System.out.println("Enter total Coloums");
		int coloums = sc.nextInt();

		int matrix1[][] = new int[rows][coloums];
		int matrix2[][] = new int[rows][coloums];
		int summatrix[][] = new int[rows][coloums];

		System.out.println("Enter 1st matrix data");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloums; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter 2st matrix data");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloums; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Sum of Two Matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloums; j++) {
				summatrix[i][j] = matrix1[i][j] + matrix2[i][j];

				System.out.print(summatrix[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("Substract of Two Matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloums; j++) {
				summatrix[i][j] = matrix1[i][j] - matrix2[i][j];

				System.out.print(summatrix[i][j] + " ");
			}
			System.out.println();

		}

	}

}
