package strings;

import java.util.Scanner;

public class ConcatExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the firstname");
		String firstName=sc.next();
		System.out.println("enter the lastname");
		String lastName=sc.next();
		System.out.println(firstName+""+lastName);
		
		

	}

}
