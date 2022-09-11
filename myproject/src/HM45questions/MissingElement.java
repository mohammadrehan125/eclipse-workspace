package HM45questions;

import java.util.Arrays;
import java.util.HashSet;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,2,3};
		//missing(arr);
		System.out.println(removeElement(arr,3));

	}
	 public static int removeElement(int[] nums, int val) {
	       
	        int count=0;
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i] != val)
	            {
	                nums[count] = nums[i];
	                count++;
	            }
	        }
	       System.out.println(Arrays.toString(nums));
	       return count;
	    }
	public static void missing(int [] arr)
	{
		HashSet<Integer> hs = new HashSet<>();
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			max = Math.max(max, arr[i]);
		}
		for(int i = 0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		for(int i = 1; i<= max;i++)
		{
			if(!hs.contains(i))
			{
				System.out.println(i);
			}
		}
	}

}
