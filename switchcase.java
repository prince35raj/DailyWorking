package demo.com;

import java.util.Scanner;

public class switchcase {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2st number");
		int b = sc.nextInt();
		System.out.println("Select operation");
		System.out.println("Add-A: Subtrac-S: Multiplication-M: Division-D:");
		char calculate = sc.next().charAt(0);
		switch (calculate) {
		case 'A':
			System.out.println("Sum of the given two numbers: " + (a + b));
			break;
		case 'B':
			System.out.println("Difference between the two numbers: " + (a - b));
			break;
		case 'M':
			System.out.println("Product of the two numbers: " + (a * b));
		case 'D':
			System.out.println("Result of the division: " + (a / b));
			break;
		default:
			System.out.println("Invalid use ");

		}
	}

	public static void main(String[] args) {
		switchcase s = new switchcase();
		s.main();
	}

}
