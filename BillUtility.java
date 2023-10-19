package demo.com;

import java.util.Scanner;

public class BillUtility {

	public void m1() {
		int unit;
		double payment = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr unit");
		unit = sc.nextInt();

		if (unit <= 50) {
			payment = unit * 2;
		} else if (unit <= 150) {
			payment = 50 * 2 + (unit - 50) * 2.50;
		} else if (unit > 300) {
			payment = 50 * 2 + 150 * 2.50 + (unit - 300) * 3;
		}

		System.out.println("The electricity bill  " + unit + " is : " + payment);

	}

	public static void main(String[] args) {
		BillUtility bill = new BillUtility();
		bill.m1();

	}

}
