package collection;

import java.util.HashMap;

public class OrdersMain {

	public static void main(String[] args) {
		Orders o1=new Orders(1001,"chair",34);
		Orders o2=new Orders(1002,"Table",64);
		Orders o3=new Orders(1003,"Swing",94);
		HashMap<Integer,Orders>map=new HashMap<Integer,Orders>();
        map.put(o1.getOid(), o1);
        map.put(o2.getOid(), o2);
        map.put(o3.getOid(), o3);
        System.out.println(map);
	}

}
