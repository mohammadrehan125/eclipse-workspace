package work;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
//		int [] arr = {1,2,3,2,4,5,2,7};
		int x = 2;
//		System.out.println(firstoccurance(arr, x));
//		System.out.println(lastoccurance(arr, x));
		
//		System.out.println(Oc(arr, 0, x,-1));
		System.out.println(fOc(arr, 0, 67));

	}
	public static int firstoccurance(int [] arr,int x)
	{
		int low = 0;
	int high = arr.length-1;
		int ans = -1;
		
		while(low < high)
		{
			int mid = (low+high)/2;
			
			if(x== arr[mid])
			{
				ans = mid;
				high = mid-1;
				
			}
			else if(x > arr[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		
	}
		return ans;
		
	}
	
	public static int lastoccurance(int [] arr,int x)
	{
		int low = 0;
		int high = arr.length-1;
		int ans = -1;
		
		while(low <= high)
		{
			int mid = (low+high)/2;
			
			if(x== arr[mid])
			{
				ans = mid;
				low = mid+1;
				
			}
			else if(x > arr[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
			
		}
		return ans;
		
		
		
	}
	public static int lOc(int [] arr,int id,int ele,int ans)
	{
		if(id == arr.length)
		{
			return ans;
		}
		if(arr[id] == ele)
		{
			ans = id;
		}
		return lOc(arr, id+1,ele,ans);
	}
	public static int fOc(int [] arr,int id,int ele)
	{
		if(id == arr.length)
		{
			return -1;
		}
		if(arr[id] == ele)
		{
			return id;
		}
		else
		{
			return fOc(arr, id+1,ele);
		}
	}

}
