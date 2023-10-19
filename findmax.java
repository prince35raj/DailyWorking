package demo.com;

import java.util.Arrays;
import java.util.Scanner;

public class findmax 
{
	public static void main(String[] args) {
		int n = 0;
		int large = 0;
		int small=0;
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enetr Array element");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			
		}
		large=array[0];
		for (int i = 0; i <n; i++) {
			if (array[i] > large)
			{
				large = array[i];
			}
		}
		System.out.println(large);		
		
	}
	
	   

}
