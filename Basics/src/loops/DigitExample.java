package loops;

import java.util.Scanner;

public class DigitExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs");
		//123
		int digit=0;
		for(int n=sc.nextInt();n!=0;)//123!=0 12!=0 1!=0
		{
			digit=n%10;//digit=123/10 12%10=2 1%10=1
			System.out.println(digit);//3,2,1
			n=n/10;//123/10=12  12/10=1 
		}
		
	}

}
