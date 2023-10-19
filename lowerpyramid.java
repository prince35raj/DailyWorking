package demo.com;

import java.util.Scanner;

public class lowerpyramid {
	public static void main(String[] args) {
		
	
	int i, j;
	System.out.println("Eneter rows value");
	Scanner sc = new Scanner(System.in);
	int rows = sc.nextInt();
	System.out.println("enetr coloums");
	int cols = sc.nextInt();

	int s[][]=new int [rows][cols];for(i=0;i<rows;i++)
	{
		for (j = 0; j < cols; j++) {
			s[i][j] = sc.nextInt();
		}

	}for(i=0;i<rows;i++)
	{
		for (j = 0; j < cols; j++) {
			System.out.print(s[i][j] + " ");
		}

		System.out.println();
	}
	System.out.println("diagonal elements are");

	for(i=0;i<cols;i++)
	{

		for (j = 0; j < cols; j++) 
		{
			if(j>=i && j<cols-1 )
			{
				System.out.println(s[rows-i-1][j]+ " ");
			}
			else
			{
				System.out.println(" ");
				
			}
			
		}
		System.out.println();
	}
}}
