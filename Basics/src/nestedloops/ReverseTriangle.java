package nestedloops;

public class ReverseTriangle {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)//5>=1 4>=1 3>=1 2>=1 1>=1
		{
			for(int j=1;j<=i;j++)//1<=5 2<=5,3<=5 4<=5 5<=5
				                //1<=4 2<=4 3<=4 4<=4
				                //1<=3 2<=3 3<=3
				                //1<=2 2<=2
				               //1<=1
			{
				System.out.print("*");//12345
				                    //1234
				                    //123
				                    //1 2
				                    //1
			}
			System.out.println();
		}
	}

}
