package loops;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//5
		int fact=1;;
		for(int i=1;i<=n;i++)//1<=5 2<=5 3<=5 4<=5 5<=5
		{
			 fact=fact*i;//fact=1*1 fact=1*=2=2 fact=2*3=6 fact=6*4=24 fact=24*5=120
		}
		System.out.println("The factorial is=:"+fact);//120

	}

}
