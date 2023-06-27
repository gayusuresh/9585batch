package variablesanddatatypes;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("The initial is");
		char initial=sc.next().charAt(0);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int total=m1+m2+m3+m4+m5;
		double percentage=(total*100)/500.0;
		System.out.println("The Student id=:"+id);
		System.out.println("The Student Name=:"+initial+"."+name);

		System.out.println("The Student total=:"+total);

		System.out.println("The Student percentage=:"+percentage);



	}

}
