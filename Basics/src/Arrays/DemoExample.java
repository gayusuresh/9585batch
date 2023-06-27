package Arrays;

import java.util.Scanner;

public class DemoExample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//3
		int a[]=new int[size];
		System.out.println("enter inputs");
		for(int i=0;i<size;i++)//0<3 1<3 2<3 3<3
		{
			a[i]=sc.nextInt();//a[0]=11 a[1]=33 a[2]=44
			
		}
		System.out.println("your outputs");
		
		
		 for(int i=0;i<size;i++) { System.out.println(a[i]); }
		 


	}

}
