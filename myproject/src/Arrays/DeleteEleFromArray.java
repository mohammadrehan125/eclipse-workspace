package Arrays;

import java.util.Arrays;

public class DeleteEleFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60};
		int ele = 30;
		delete(arr,ele);
		
		

	}
	public static void delete(int []arr,int ele)
	{
		for(int i = 0; i< arr.length;i++)
		{
			if(ele == arr[i])
			{
				for(int j = i; j < arr.length-1;j++)
				{
					arr[j] = arr[j+1];
				}
				break;
			}
			
		}
		for(int i = 0; i< arr.length-1;i++)
			System.out.print(arr[i]+" ");
	}

}
