package variablesanddatatypes;

import java.util.Scanner;

public class SwapExample {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x value");
		int x=sc.nextInt();//2
		System.out.println("enter the y value");
		int y=sc.nextInt();//4
		System.out.println("Before swap x=:"+x);
		System.out.println("Before Swap y=:"+y);
		//int temp=x;//temp=2
		x=x*y;//8  //2*4=8
		y=x/y;//y=8/4=2
		x=x/y;//x=8/2=4
		System.out.println("After swap x=:"+x);//4
		System.out.println("After swap y=:"+y);//2
	}

}
