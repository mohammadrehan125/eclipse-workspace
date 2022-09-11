package Assighnment;

import java.util.ArrayList;

public class ssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {17,4,5,6,10,11,4,-3,-5,3,15,2,7};
		int target =arr[0];
		//al= new ArrayList<>();
		ATS(arr,target);

	}
	public static void ATS(int [] arr,int tar)
	{
		ArrayList<Integer> al = new ArrayList<>();

			for(int i = 1;i<arr.length;i++)
			{
				int sum = 0;
				for(int j = i; j< arr.length;j++)
				{
					sum = arr[i]+arr[j];
					if(sum == tar)
					{
						System.out.print(arr[i]+","+arr[j]+",");
					}
					
				}
			}
	}

}
