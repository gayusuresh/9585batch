package Arrays;

import java.util.Arrays;

public class TwoDArrayCopy {

	public static void main(String[] args) {
		int a[][]= {{1,2},{2,3},{3,4}};
		
		int a1[][]=a;//deep copy
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a1[i][j]);
			}
			System.out.println();
		}
		System.out.println("===============================");
        a[0][0]++;
        for(int temp[]:a)
		{
			System.out.println(Arrays.toString(temp));
		}
    	System.out.println("===============================");
        for(int temp[]:a1)
		{
			System.out.println(Arrays.toString(temp));
		}
    	System.out.println("===============================");
	}

}
