package strings;

import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String word=sc.next();//madam
		for(int i=word.length()-1;i>=0;i--)//i=4 4>=0 3>=0 2>=0 1>=0 0>=0
		{
			char a=word.charAt(i);//
			System.out.print(a);//madam
			
		}
		
	}

}
