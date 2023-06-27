package Arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//3
		int a[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++)//0<3 1<3 2<3
		{
			a[i]=sc.nextInt();//a[0]=1 a[1]=2 a[2]=4
			
			sum=sum+a[i];//sum=0+1=1 sum=1+2=3 sum=3+4=7
			
		}
		
		System.out.println("The sum=:"+sum);//7
	}

}
