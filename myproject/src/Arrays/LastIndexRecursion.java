package Arrays;

public class LastIndexRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {3,2,1,2,3};
		int ele = 2;
		System.out.println(lastind(arr,0,ele,-1));

	}
	  public static int lastind(int[] arr,int id,int ele, int ans)
	  {
	        if(id == arr.length)
	        {
	            return ans;
	        }
	        else
	        {
	            if(arr[id] == ele)
	            {
	                ans = id;
	            }
	            
	            return lastind(arr,id+1,ele,ans);
	        }
	        
	  }

}
