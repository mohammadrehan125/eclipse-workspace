package Arrays;

public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,8,6,1,9,7};
		
		System.out.println(isSotrted(arr, 0));

	}
	
	public static boolean isSotrted(int arr[] , int id)
	{
		if(id == arr.length-1)
		{
			return true;
		}
		if(arr[id] > arr[id+1])
		{
			return false;
		}
		else
		{
			return isSotrted(arr, id+1);
		}
		
	}

}
