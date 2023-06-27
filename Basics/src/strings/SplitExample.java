package strings;

import java.util.Scanner;

public class SplitExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence=sc.nextLine();
		String[] word=sentence.split(",");
		for(String j:word)
		{
			System.out.println(j);
		}

	}

}
