package Stack27;

public class StackClient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		MyStack st = new MyStack(5);
		
		
		for(int i = 1;i <= 5;i++)
		{
			st.push(i);
		}
//		st.pop();
//		
//		st.push(6);
		
		st.display();
		
		System.out.println(st.peek());
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		st.display();

	}

}
