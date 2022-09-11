package Assighnment;

public class RotatedArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,5,1,2};
		System.out.println(FM(arr,0,arr.length-1));

	} 
	public static int FM(int [] arr,int low,int high)
	{
		if(high<low)
		{
			return arr[0];
		}
		if(high == low)
		{
			return arr[low];
		}
		int mid = low+(high-low)/2;
		if(mid<high && arr[mid+1] < arr[mid])
		{
			return arr[mid+1];
		}
		if(mid > high && arr[mid] < arr[mid-1])
		{
			return arr[mid];
		}
		if(arr[high] > arr[mid])
		{
			return FM(arr,low,mid-1);
		}
		return  FM(arr,mid+1,high);
		
	}

}
