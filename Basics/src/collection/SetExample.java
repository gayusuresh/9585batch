package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
	TreeSet<Integer>set=new TreeSet<Integer>();
		set.add(78);
		set.add(38);
		set.add(56);
		set.add(45);
		set.add(98);
		set.add(78);
		System.out.println(set);
		set.add(79);
		System.out.println(set);
		set.remove(56);
		
		System.out.println(set);
    System.out.println("==================");
    Iterator<Integer>it=set.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    System.out.println("=========================");
    for(Integer s:set)
    {
    	System.out.println(s);
    }
    }

}
