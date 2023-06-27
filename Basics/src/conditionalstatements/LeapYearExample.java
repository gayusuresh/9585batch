package conditionalstatements;

import java.util.Scanner;

public class LeapYearExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the leap year");
		int year=sc.nextInt();
		if(year%4==0)//1900
		{
			if(year%100==0)//1900%100==0
			{
				if(year%400==0)//1900%400==0
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not leap year");
				}
			}
			else
			{
				System.out.println("not a century year but leap year");
			}
			
		}
		else
		{
			System.out.println("not leap year");
		}

	}

}
