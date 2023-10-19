package demo.com;

public class overloading 
{
	public void method1(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
			
	}
	
	public void method1(String a,String b )
	{
	//	String s=a+b;
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		overloading over=new overloading();
		over.method1(10, 20);
		over.method1("prince",  "kumar");
		
		
		
	}

}
