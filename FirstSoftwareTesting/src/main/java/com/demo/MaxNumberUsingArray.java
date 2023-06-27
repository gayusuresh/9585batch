package com.demo;

public class MaxNumberUsingArray 
{
	public static int maxArray(int a[])//a[0]=1,a[1]=2,a[2]=3
	{
		int max=a[0];//1
		for(int i=0;i<a.length;i++)//0<3 1<3 2<3
		{
			if(max<a[i])//1<1 1<2 2<3
			{
			   max=a[i];//max=2 max=3
			}
			
		}
		return max;//3
	}

}
