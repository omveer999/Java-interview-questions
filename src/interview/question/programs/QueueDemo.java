package interview.question.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		
		System.out.println("Queue elements : "+queue);
		System.out.println("Poll element : "+queue.poll());
		System.out.println("After poll queue element : "+queue);
		
		Iterator<Integer> queueIterator=queue.iterator();
		while(queueIterator.hasNext()) {
			System.out.println(queueIterator.next());
		}
	}
}
