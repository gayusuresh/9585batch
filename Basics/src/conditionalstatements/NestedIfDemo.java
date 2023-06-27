package conditionalstatements;

public class NestedIfDemo {

	public static void main(String[] args) {
		int x=4;
		if(x<5)//outer if condition is true
		{
			if(x==3)//inner if
			{
				System.out.println("x i s =3");
			}
			else
			{
				System.out.println("x is not equla 3");
			}
		}
		else
		{
			System.out.println(" x is not lessthan 5");
		}

	}

}
