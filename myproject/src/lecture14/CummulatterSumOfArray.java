package lecture14;

import java.util.Arrays;

public class CummulatterSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {1,2,3,4,5};
	//int sum[] = new int[arr.length];
	int sum = 0 ;
		for(int i = 0;i<arr.length;i++)
		{
			sum += arr[i];
			arr[i] = sum;
		}
		System.out.println(Arrays.toString(arr));
	}

}