package Stack29;

import Inheritance28.DynamicStack;

public class StackActualReverse {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		DynamicStack st = new DynamicStack();
		for(int i = 1;i <= 5;i++)
		{
			st.push(i);
		}
		
		st.display();
		Ar2(st);
		st.display();

	}
	
	public static void actualR(DynamicStack st)
	{
		DynamicStack temp1 = new DynamicStack();
		DynamicStack temp2 = new DynamicStack();
	}

	public static void Ar2(DynamicStack st)throws Exception
	{
		DynamicStack temp = new DynamicStack();
		while(!st.isEmpty())
		{
			temp.push(st.pop());
		}
		
		Ar2helper(st,temp);
		
	}
	
	public static void Ar2helper(DynamicStack st,DynamicStack temp)throws Exception
	{
		if(temp.isEmpty())
		{
			return;
		}
		
		int n = temp.pop();
		Ar2helper(st,temp);
		st.push(n);
	}
}
