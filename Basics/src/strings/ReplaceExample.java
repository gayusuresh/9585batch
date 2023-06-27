package strings;

import java.util.Scanner;

public class ReplaceExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String sentence=sc.nextLine();
		String change=sentence.replace('d', 't');
		System.out.println(change);

	}

}
