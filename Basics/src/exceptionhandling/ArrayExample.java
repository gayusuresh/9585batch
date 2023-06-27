package exceptionhandling;

public class ArrayExample {

	public static void main(String[] args) 
	{
		try
		{
		int a[]= {3,4,5};
		System.out.println(a[4]);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}
