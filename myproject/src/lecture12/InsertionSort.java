package lecture12;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int []A = new int[N];
	        for(int i = 0; i < N;i++)
	        {
	            A[i] = sc.nextInt();
	        }
	        insertionSort(A);
	        for(int i = 0; i < A.length;i++)
	        {
	          System.out.print(A[i]+" ");
	        }
	        

	    }
	    public static void insertionSort(int [] A)
	    {
	       for(int i = 1; i < A.length;i++)
	       {
	           insert(A,i);
	       }
	    
	    }
	    public static void insert(int []arr,int n)
	    {
	        int temp = arr[n];
	        int pos = 0;
	        for(int i = n-1; i >= 0;i--)
	        {
	            if(temp < arr[i])
	            {
	                arr[i+1] = arr[i];
	            }
	            else
	            {
	                pos = i+1;
	                break;
	            }
	        }
	        arr[pos] = temp;
	    }
}
