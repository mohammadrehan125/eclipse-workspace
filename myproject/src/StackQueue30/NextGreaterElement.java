package StackQueue30;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={9,0,7,6,5,4,3,2,1};
		ng(arr);
		
		
//		int[] ans = nextGreater(arr);
//		System.out.println(Arrays.toString(ans));
////		ng(arr);
//		for(int i = 1; i<= 10;i++)
//		{
//			if(prim (i))
//			{
//				System.out.println(i);
//			}
//		}
		
	}
	public static boolean prim(int n)
	{		
			for(int j = 2; j<=n-1;j++)
			{
				if(n%j == 0)
				{
					return false;
				}
			}
			return true;
	}
	
	
	public static void ng(int [] arr)
	{
		int n = -1;
		for(int  i = 0;i <arr.length;i++)
		{
			int c = 0;
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[j] >arr[i])
				{
					System.out.println(arr[i] +" , "+arr[j]);
					c++;
					break;
				}
				
			}
			if(c==0)
			{
				System.out.println(arr[i]+" , "+n);
			}
		}

		
	}
	
// using Queue
	
	public static int[] nextGreater(int [] arr)
	{
		int ans [] = new int[arr.length];
		
		Stack<Integer> st = new Stack<>();
		for(int i = 0;i<arr.length;i++)
		{	
			while(!st.isEmpty() && arr[i] > arr[st.peek()])
			{
				int id = st.pop();
				ans[id] = arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
			int id = st.pop();
			ans[id] = -1;
		}
		return ans;
	}

}
