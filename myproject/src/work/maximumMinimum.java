package work;

import java.util.Arrays;

public class maximumMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4};
		//max(arr);
		min(arr);

	}
	public static void max(int [] arr)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}
	public static void min(int [] arr)
	{
		int min = Integer.MAX_VALUE;
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
		
	}

}
