package Queue27;

public class QueueClient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		MyQueue q = new MyQueue(5);
		
		for(int i = 1; i <= 4;i++)
		{
			q.enqueue(i);
		}
		q.display();
		System.out.println(q.peek());
		System.out.println(q.dequeue());

		q.display();
		q.dequeue();
		q.display();
		
		q.enqueue(5);
		q.enqueue(6);
		q.display();
	}

}
