package lacture9;
import java.util.*;

public class ProductofSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
	
		long[] ans = new long[arr.length];

		long prod = 1;
		for(int i = 0; i < ans.length; i++)
		{
			ans[i] = prod;
			prod *= arr[i]; 
		}
		prod = 1;
		for(int i = arr.length-1; i >= 0;i--)
		{
			ans[i] *= prod;
			prod *= arr[i]; 
		}

		System.out.println(Arrays.toString(ans));
	}

	}
