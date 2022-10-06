package prac11;


import java.util.LinkedList;
import java.util.Queue;

interface QueueDS{
	Queue<Integer> q
	= new LinkedList<>();
	
	void add(int n);
	void remove();
	void peek();
}


class IntegerQueue implements QueueDS{

	@Override
	public void add(int n) {
		q.add(n);
		
	}

	@Override
	public void remove() {
		q.remove();
	}

	@Override
	public void peek() {
		System.out.println(q.peek());
	}
	
	
}

public class pgm2 {

	public static void main(String[] args){
		
		IntegerQueue iq = new IntegerQueue();
		iq.add(5);
		iq.add(7);
		iq.add(6);
		iq.remove();
		iq.peek();
	}
}
