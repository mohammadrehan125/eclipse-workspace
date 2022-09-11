package Assighnment;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {0,4,6,8,9};
		reverse(arr);
		 for(int i = 0; i < arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }
		
		
	}
    public static void reverse(int[] arr)
    {
        int si = 0;
        int ei = arr.length-1;
        while(si < ei)
        {
            swap(arr,si,ei);
            si++;
            ei--;
        }
    }
    public static void swap(int[] arr,int a,int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
