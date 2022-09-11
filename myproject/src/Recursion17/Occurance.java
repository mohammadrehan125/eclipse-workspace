package Recursion17;

import java.util.ArrayList;
import java.util.Arrays;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,2,4,5,5,2,6,2};
		int ele = 2;
//		LOC(arr,0,8,-1);
//		System.out.println(LOC2(arr,0,8,-1));
//		System.out.println(FOC(arr,0,4));
//		PrintAllOc(arr, 0, ele);
		
//		ArrayList<Integer>al = new ArrayList<>();
//		StoreAlloC(arr, 0, ele, al);
//		System.out.println(al);
		int [] ans = StorAllOc(arr, 0, ele, 0);
		System.out.println(Arrays.toString(ans));

			
	}
	public static int FOC(int [] arr,int id,int ele)
	{
		if(id == arr.length)
		{
			
			return -1;
		}
		else
		{
			if(arr[id] == ele)
			{
				return id;
			}
			else
			{	
				return FOC(arr,id+1,ele);
			}
		}
	}
	
	public static void LOC(int [] arr,int id,int ele,int ans)
	{
		if(id == arr.length)
		{
			System.out.println(ans);
			return;
		}
		else
		{
			if(arr[id] == ele)
			{
				ans = id;
			}
			 LOC(arr,id+1,ele,ans);
		}
	}
	
	public static int LOC2(int [] arr,int id,int ele,int ans)
	{
		if(id == arr.length)
		{
			return ans;
		}
		else
		{
			if(arr[id] == ele)
			{
				ans = id;
			}
			return LOC2(arr,id+1,ele,ans);
		}
	}
	
	public static void PrintAllOc(int [] arr,int id,int ele)
	{
		if(id== arr.length)
		{
			return ;
		}
		else
		{
			if(arr[id] == ele)
			{
				System.out.println(id);
			}
			PrintAllOc(arr, id+1, ele);
		}
	}
	
	public static void StoreAlloC(int []arr,int id,int ele,ArrayList<Integer> ans)
	{
		if(id == arr.length)
		{
			return;
		}
		else
		{
			if(arr[id] == ele)
			{
				ans.add(id);
			}
			StoreAlloC(arr, id+1, ele, ans);
		}
	}
	
	public static int[] StorAllOc(int [] arr,int id,int ele,int count)
	{
		if(id == arr.length)
		{
			int [] ans = new int[count];
			return ans;
		}
		else
		{
			if(arr[id] == ele)
			{
				count++;
			}
			
			int [] indArr = StorAllOc(arr, id+1, ele, count);
			
			if(arr[id] == ele)
			{
				indArr[count-1] =id;
			}
			return indArr;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
