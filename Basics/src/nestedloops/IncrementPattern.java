package nestedloops;

public class IncrementPattern {

	public static void main(String[] args) 
	{
		int num=1;
		for(int i=1;i<=4;i++)//1<=4 2<=4 3<=4v4<=4
		{
			for(int j=1;j<=i;j++)//1<=1 2
				                 //1<=2 2<=2
				                  //1<=3 2<=3 3<=3
				                  //1<=4 2<=4 3<=4 4<=4
			{
				System.out.print(num);//1
				                     //2 3
				                     //4 5 6
				                     //7 8 9 10
				num++;//2,3,4
			}
			System.out.println();
		}

	}

}
