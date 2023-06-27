package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Float>list=new LinkedList<Float>();
		list.add(78.4f);
		list.add(28.2f);
		list.add(48.4f);
		list.add(68.1f);
		list.add(78.3f);
		list.add(89.9f);
		System.out.println(list);
		
		ListIterator<Float>it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
System.out.println("=============================Previous");

while(it.hasPrevious())
{
	System.out.println(it.previous());
}
System.out.println("==============================");
Collections.sort(list);
System.out.println(list);
	}

}
