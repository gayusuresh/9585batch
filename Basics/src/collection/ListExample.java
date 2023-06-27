package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(45);
		list.add(33);
		list.add(33);
		list.add(23);
		list.add(25);
		System.out.println(list);
		list.set(0, 89);//update
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	System.out.println("=========================");	
Iterator<Integer>it=list.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	
	System.out.println("=================");
	for(int i=0;i<list.size();i++)//0<5 1<5
	{
		System.out.println(list.get(i));//34,
	}
System.out.println("=========================");
for(Integer i:list)
{
	System.out.println(i);
}
System.out.println("=========================");
Collections.sort(list);
System.out.println(list);
}
}