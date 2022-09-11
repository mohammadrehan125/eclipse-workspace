package lecture13;

public class ArrayMirrorInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {4,0,2,1,3};
		int inv[] = new int[arr.length];
		System.out.println(Ami(arr,inv));

	}
	public static boolean Ami(int []arr,int [] inv)
	{
		
	         for(int i = 0;i< arr.length;i++)
	         {
	             inv[arr[i]] = i;
	         }
	         if(inv != arr)
	         {
	             return false;
	         }  
	      return true;
	}

}
