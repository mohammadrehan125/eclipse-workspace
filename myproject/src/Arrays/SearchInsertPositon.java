package Arrays;

import java.io.Serial;

public class SearchInsertPositon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,3,5,6};
		System.out.println(searchInsert(arr, 7));
	}
	
	 public static int searchInsert(int[] nums, int target) {
	     
		 int low = 0;
		 int high = nums.length-1;
		 
		 while(low <= high)
		 {
			 int mid = (low+high)/2;
			 if(target == nums[mid])
			 {
				 return mid;
			 }
			 else if(target > nums[mid])
			 {
				 low = mid+1;
			 }
			 else
			 {
				 high = mid-1;
			 }
		 }
// insert position		 
		 return low;
		 
	    }

}
