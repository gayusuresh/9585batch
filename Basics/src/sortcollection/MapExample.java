package sortcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(8, "guva");
		map.put(1, "apple");
		map.put(2, "mango");
		map.put(3, "orange");
		map.put(1, "grapes");
		map.put(4, "kiwi");
		map.put(5, "banana");
		System.out.println(map);
		
		

	}

}
