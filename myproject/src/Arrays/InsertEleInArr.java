package Arrays;

import java.util.Arrays;

public class InsertEleInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60};
		int ele = 100;
		insert(arr, ele, 3);
	}		
	public static void insert(int [] arr,int ele,int pos)
	{
		for(int i = arr.length-1;i > pos-1; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[pos-1] = ele;
		System.out.println(Arrays.toString(arr));
	}

}
