package Assighnment;

import java.util.Arrays;

public class PairOfRoses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,4,6,8,10};
		Arrays.sort(arr);
		gfr(arr,10);
	}
	public static void gfr(int arr[],int sum)
	{
		int ansi = 0;
		int ansj = 0;
		int i = 0 ; 
		int j = arr.length-1;
		while(i<j)
		{
			if(arr[i]+arr[j] == sum)
			{
				ansi = arr[i];
				ansj = arr[j];
				i++;
				j--;
			}
			else if(arr[i]+arr[j] > sum)
			{
				j--;
			}
			else
			{
				i++;
			}
				
		}
		System.out.println("Deepak should buy roses whose prices are "+ansi+" and "+ansj);
		
	}
}

