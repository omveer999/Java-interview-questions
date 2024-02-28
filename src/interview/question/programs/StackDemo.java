package interview.question.programs;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("Stack elements :"+stack);
		System.out.println(stack.pop());
		System.out.println("After pop stack elements : "+stack);
		
		Iterator<Integer> stackIterator=stack.iterator();
		while(stackIterator.hasNext()) {
			System.out.println(stackIterator.next());
		}
	}
}
