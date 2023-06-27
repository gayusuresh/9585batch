package loops;

import java.util.Scanner;

public class FactorsExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs");
		int n=sc.nextInt();//6
		int start=1;
		do
		{
			if(n%start==0)
			{//6%1==0 6%2==0 6%3==0 6%4==0 6%5==0 6%6==0
			System.out.println(start);//1,2,3,6
			}
			start++;//2,3,4,5,6
		}
	while(start<=n);//1<=6 2<=6 3<=6 4<=6 5<=6 6<=6
	}

}
