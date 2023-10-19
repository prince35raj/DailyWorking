package demo.com;

import java.util.Scanner;

public class overriding1 extends overiding {
	public void method1() {
		String a = null,b = null,c;
		c=a+b;
		System.out.println("this is parent class:"+c);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	   System.out.println("Enter name");
	   String c=sc.next();
	
		overiding o = new overiding();
		o.method1();


//		overiding p = new overriding1();
//		p.method1("rohit", "sharma");

	}

}
