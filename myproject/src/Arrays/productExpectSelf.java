package Arrays;

import java.util.Arrays;

public class productExpectSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		product(arr);

	}
	public static void product(int [] arr)
	{
		int [] ans = new int [arr.length];
		int prod = 1;
		for(int i = 0;i <ans.length;i++)
		{
			ans[i] = prod;
			prod *= arr[i];
		}
		
		prod = 1;
		for(int i = arr.length-1;i >= 0;i--)
		{
			ans[i] *= prod;
			prod *= arr[i];
			
		}
		System.out.println(Arrays.toString(ans));
	}

}
