package exceptionhandling;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("positive number");
		}
		else
		{
			try
			{
			throw new Exception("negative number");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

}
