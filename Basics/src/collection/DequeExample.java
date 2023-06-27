package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer>queue=new LinkedList<Integer>();
		queue.add(22);
		queue.add(23);
		queue.add(24);
		queue.add(25);
		System.out.println(queue);
		queue.addFirst(34);
		queue.addLast(78);
		System.out.println(queue);
		queue.removeFirst();
		queue.removeLast();
		System.out.println(queue);

	}

}
