package sortcollection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortExample {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(34);
		list.add(45);
		list.add(33);
		list.add(33);
		list.add(23);
		list.add(25);
		System.out.println(list);
		System.out.println("==============Sort==============");
		Collections.sort(list);
		System.out.println(list);
	}

}
