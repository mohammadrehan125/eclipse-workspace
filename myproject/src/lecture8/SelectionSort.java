package lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			int[] arr = {2,5,1,4,3};
	        selectionSort(arr);
	        System.out.println(Arrays.toString(arr));

	    }
	    public static int minIndex(int[] arr,int id)
	    {
	        int minid = id;
	        for(int i = id+1;i<arr.length-1;i++)
	        {
	            if(arr[minid]>arr[i])
	            {
	                minid = i;
	            }
	        } return minid ;
	    }
	    public static void swap(int[] arr,int a,int b)
	    {
	        int t = arr[a];
	        arr[a] = arr[b];
	        arr[b] = t;
	    }
	    public static void selectionSort(int[] arr)
	    {
	        for(int i = 0;i<=arr.length;i++)
	        {
	            int minid = minIndex(arr,i);
	            swap(arr,i,minid);
	        }
	    }


}
