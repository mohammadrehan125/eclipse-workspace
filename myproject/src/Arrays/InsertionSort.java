package Arrays;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {5,1,6,2,4,3};
		int temp = 0;
		for(int i = 1; i < arr.length; i++)
		{
			temp = arr[i];
			for(int j = i; j >0; j--)
			{
				if(arr[j-1] > temp)
				{
					arr[j] = arr[j-1];
				}
				
			}
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
