package exceptionhandling;

public class ArithmeticExample {

	public static void main(String[] args) {
		int i=9,j=0;
		
		try
		{
			int k=i/j;
			System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello");
		}

	}

}
