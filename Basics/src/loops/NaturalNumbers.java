package loops;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//5
		int start=1;
		while(start<=n)//1<=5----5<=5 6<=5=f
		{
			System.out.println(start);//1---5
			start++;//2--6
		}

	}

}
