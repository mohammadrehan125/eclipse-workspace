package HM45questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Friquency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,6,2,1,4,0,2,0};
//		System.out.println(fr(arr));
		int [] ans = nextGreater(arr);
		System.out.println(Arrays.toString(ans));
		//6 2 1 0 0 -1 0 -1 
//		 Scanner sc = new Scanner(System.in);
//	        int t = sc.nextInt();
//	        for(int i= 0;i<t;i++)
//	        {
//	            int n = sc.nextInt();
//	            int [] arr = new int[n];
//	            for(int j = 0; j< arr.length; j++)
//	            {
//	                arr[j] = sc.nextInt();
//	            }
//	            int[] ans = nextGreater(arr);
//	            for(int k = 0; k< ans.length; k++)
//	            {
//	                System.out.print(ans[k]+" ");
//	            }
//	            System.out.println();
//
//	        }  
	}
	public static int[] nextGreater(int [] arr)
	{

        int ans [] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i = 0;i<arr.length;i++)
		{	
			while(!st.isEmpty() && arr[i] < arr[st.peek()])
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
	
	public static int fr(int [] arr)
	{
		HashMap<Integer, Integer>map = new HashMap<>();
		
		for(int i = 0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		int max = Integer.MIN_VALUE;
		int m= 0;
		Set<Map.Entry<Integer, Integer>> et = map.entrySet();
		for(Map.Entry<Integer, Integer>ent:et)
		{
			if(ent.getValue() > m)
			{
				m = ent.getValue();
				max = ent.getKey();
			}
		}
		return max;

	}
}
