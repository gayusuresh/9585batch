package strings;

import java.util.Scanner;

public class CompareTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username");
		String username=sc.next();
		System.out.println("enter the pwd");
		String pwd=sc.next();
		if(username.equals("admin") && pwd.equals("123"))
		{
			System.out.println("welcome to Edubridge");
		}
		else
		{
			System.out.println("Invalid User");
		}

	}

}
