package exceptionhandling;

public class NumberExceptionExample {

	public static void main(String[] args) {
		
		try
		{
			int i;
			
			String s="hello";
		i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
