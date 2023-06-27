package variablesanddatatypes;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		System.out.println("The Area of circle is=:"+area);

	}

}
