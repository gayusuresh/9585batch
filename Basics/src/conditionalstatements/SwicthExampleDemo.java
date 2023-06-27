package conditionalstatements;

import java.util.Scanner;

public class SwicthExampleDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char alphabet=sc.next().charAt(0);
		switch(alphabet)
		{
			case 'A','a':System.out.println("apple");
			break;
			case 'B','b':System.out.println("Ball");
			break;
			case 'C','c':System.out.println("CAT");
			break;
			case 'D','d':System.out.println("Dog");
			break;
			case 'E','e':System.out.println("Egg");
			break;
			case 'F','f':System.out.println("Fan");
			break;
			case 'G','g':System.out.println("Goat");
			break;
			case 'H','h':System.out.println("House");
			break;
			case 'I','i':System.out.println("Icecream");
			break;
			default:System.out.println("no matching data found");
		}

	}

}
