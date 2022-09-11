package Arrays;

import java.util.Arrays;

public class ArrayTripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5 ,7, 9, 1, 2, 4, 6, 8, 3};
		
		
		Arrays.sort(arr);
		
	//	System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i< arr.length; i++)
		{
			int sum = 0;
			for(int j= i+1 ; j<arr.length;j++)
			{
				for(int k = j+1 ;k<arr.length;k++)
				{
					sum = arr[i]+arr[j]+arr[k];
					if(sum == 10)
					{
						System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
					}
				}
				
			}
		}

	}

}
