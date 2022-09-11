package Arrays;

import java.util.Arrays;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		product(arr);

	}
	
	public static void product(int [] arr)
	{
		int [] ans = new int[arr.length];
		for(int i = 0;i < arr.length;i++)
		{
			int prod = 1 ;
			for(int j = 0;j <arr.length;j++)
			{
				if(i != j)
				{
					prod *= arr[j];
				}
			}
			ans[i] = prod;
		}
		System.out.println(Arrays.toString(ans));
	}
}
