package Arrays;

import java.util.HashMap;

public class FriquencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,8,3,2,2,2,5,1};
		
//		int[]frq = new int[arr.length];
		
//		frq(arr,frq);
		
		
		fra(arr);
	}
	
	public static void frq(int [] arr,int [] frq)
	{
		
		for(int i = 0;i<arr.length;i++)
		{
			int count = 1;
			if(arr[i] != -1)
			{
				for(int j = i+1; j <arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						count++;
						arr[j] = -1;
					}
				}
				frq[i] = count;
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != -1)
			{
				System.out.println(arr[i] +" : "+ frq[i] );
			}
		}
	}
	
	// HashMap
	public static void fra(int [] arr)
	{
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i<arr.length;i++)
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
		for(int val : map.keySet())
		{
			System.out.println(val +" --> "+map.get(val));
		}	
	}

}
