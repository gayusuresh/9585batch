package loops;

import java.util.Scanner;

public class ReverseNumberExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//123
		int digit,rev=0;
		while(n!=0)//123!=0 12!=0 1!=0
		{
			digit=n%10;//digit=123%10=3 12%10=2 1%10=1
			rev=rev*10+digit;//rev=0*10+3=3  rev=3*10=30+2=32 rev=32*10=320+1=321
			n=n/10;//123/10=12 12/10=1//
			
		}
		System.out.println("Reverse is=:"+rev);//321

	}

}
