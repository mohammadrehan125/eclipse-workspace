package lacture9;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,6,8,10,11,13,15};
		int n = 10;
		//BinarySearch(arr,n);
		System.out.println(BinarySearch(arr,n));
	}

	public static int BinarySearch(int []arr,int ele)
	{
		int low = 0;
		int high = arr.length-1;
		while(low <= high)
		{
			int mid = (low + high)/2;
			if(ele == arr[mid])
			{
				return mid;
			}
			else if(ele > arr[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid -1;
			}
		}
		return -1;
		
		
	}

}
