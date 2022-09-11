package Arrays;

import java.util.Arrays;

public class MergeTwoSArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,5,7};
		int [] brr = {2,4,6,8};
		merge(arr,brr);
	}
	
	public static void merge(int []arr,int [] brr)
	{
		int [] ans = new int[arr.length > brr.length?arr.length:brr.length];
		int i = 0;
		int j = 0;
		int c = 0;
		
		while(i <=arr.length-1 &&j <= brr.length-1)
		{
			if(arr[i] < brr[j])
			{
				ans[c] = arr[i];
				i++;
				c++;
			}
			else
			{
				ans[c] = brr[j];
				j++;
				c++;
			}
		}
		while(i<arr.length) {
			ans[c]=arr[i];
			i++;
			c++;
		}
		while(j<arr.length) {
			ans[c]=brr[j];
			j++;
			c++;
		}
		System.out.println(Arrays.toString(ans));
	}

}
