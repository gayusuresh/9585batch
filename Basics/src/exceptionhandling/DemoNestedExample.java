package exceptionhandling;

public class DemoNestedExample {

	public static void main(String[] args)
	{
		int i=9,j=0;
		try
		{
			try
			{
		  int a[]= {1,2,3};
		  System.out.println(a[4]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		int k=i/j;
		System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		

	}

}
