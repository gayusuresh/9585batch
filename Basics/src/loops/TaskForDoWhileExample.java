package loops;

import java.util.Scanner;

public class TaskForDoWhileExample {
   
	public static void main(String[] args) 
	{
		  String s;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("enter the choice");
		int choice =sc.nextInt();
		switch(choice)
		{
			case 1:System.out.println("large");
			break;
			case 2:System.out.println("medium");
			break;
			case 3:System.out.println("small");
			break;
		}
		System.out.println("do u want to continue");
		s=sc.next();//yes
		}
		while(s.equals("yes"));

	}

}
