package lecture11;

import java.util.Scanner;

public class BookAllocation {

	   public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter no. of test case :");
	        int t = sc.nextInt();
	        System.out.println("Enter no. of books :");
	        int n = sc.nextInt();
	        System.out.println("Enter no. of Students :");
	        int m = sc.nextInt();
	        System.out.println("Enter no. of pages :");
	        int [] A= new int[n];
	        for(int i = 0;i<n;i++)
	        {
	            A[i] = sc.nextInt();
	        }
	    for(int i = 1;i <= t;i++)
	    {
	    	int low = 1;
			int high = 0;
			for(int val:A)
				high += val;
			int max = 0;
			while(low<=high)
			{
				int mid = (low+high)/2;
				if(isItpossible(A,m,mid))
				{
					max = mid;
					high = mid-1;
				}
				else
					
				{
					low = mid+1;
				}
			}
			System.out.println(max);
	     }
		}
		public static boolean isItpossible(int[]books,int nos,int max)
		{
			int students = 1;
			int nop = 0;
			for(int i =0;i<books.length;)
			{
				if(nop+books[i]<=max)
				{
					nop += books[i];
					i++;
				}
				else
				{
					students++;
					nop =0;
				}
				if(students > nos)
				{
					return false;
				}
				
			}
			return true;
	    }
	}