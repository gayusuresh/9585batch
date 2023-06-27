package collection;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
		queue.add(12);
		queue.add(13);
		queue.add(14);
		queue.add(15);
		queue.add(16);
		queue.add(17);
		System.out.println(queue);
		System.out.println(queue.peek());//retrieve first data
	    System.out.println(queue.poll());//remove the first data
	    System.out.println(queue);
	    System.out.println(queue.element());//retrieve first data
	    System.out.println(queue.remove());//remove the first data
	    System.out.println(queue);
	}

}
