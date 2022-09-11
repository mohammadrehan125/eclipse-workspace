package Arrays;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {0,1,0,2,3};
		int count = 0;
		for(int i = 0; i< arr.length; i++)
		{
			
			if(arr[i] != 0)
			{
				arr[count] = arr[i];
				count++;
			}
		}
		while(count < arr.length)
		{
			arr[count] = 0;
			count++;
		}
		System.out.println(Arrays.toString(arr));

	}
	
	

}
