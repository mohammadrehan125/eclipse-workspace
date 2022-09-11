package lac16;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,2,1};
		insertionSort(arr);

	}
	   public static void insertionSort(int[] arr)
	    {
	         for(int i = 0; i<arr.length; i++)
	         {
	             insert(arr,i);
	         } 
	    }
	    public static void insert(int[] arr,int N)
	    {
	        int pos = 0;
	        int temp = arr[N];
	        for(int i = N-1; i>=0 ;i--)
	        {
	            if(arr[i]<temp)
	            {
	                pos = i+1;
	                break;
	            }
	            else
	            {
	                arr[i+1] = arr[i];
	            }
	            arr[pos] = temp;
	        }
	    }
}
