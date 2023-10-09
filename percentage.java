package demo.com;

import java.util.Scanner;
public class percentage
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter obtain number");
		double obtainnumber=0;
		obtainnumber=sc.nextDouble();
		System.out.println("Enter full marks");
		double fullmarks=0;
		fullmarks=sc.nextDouble();
		double percentage= ((obtainnumber * 100)/ fullmarks);
		System.out.println(percentage);		
	}

}
