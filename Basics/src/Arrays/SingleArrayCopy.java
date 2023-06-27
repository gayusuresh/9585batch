package Arrays;

import java.util.Arrays;

public class SingleArrayCopy {

	public static void main(String[] args) {
		int first[]= {1,2,3};
		int second[]=first.clone();
		//System.out.println(Arrays.toString(second));
		for(int i=0;i<second.length;i++)
		{
			System.out.println(second[i]);
		}
		first[0]++;
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));

	}

}
