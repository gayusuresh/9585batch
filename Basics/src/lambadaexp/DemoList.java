package lambadaexp;

import java.util.Arrays;
import java.util.List;

public class DemoList {
	static int x=10;
	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(1,2,3,4,5,6);
	
		list.forEach(temp->System.out.println(x+temp));

	}

}
