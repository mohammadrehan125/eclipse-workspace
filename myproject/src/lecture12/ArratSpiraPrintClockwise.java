package lecture12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArratSpiraPrintClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  Scanner sc = new Scanner(System.in);
//	        int M = sc.nextInt();
//	        int N = sc.nextInt();
//	        int [][]arr = new int[M][N];
//	        for(int i = 0; i < M;i++)
//	        {
//	            for(int j = 0; j < N;j++)
//	            {
//	                arr[i][j] = sc.nextInt();
//	            }
//	        }
//	        int minrow = 0;
//	        int maxrow = arr.length-1;
//	        int mincol = 0;
//	        int maxcol = arr[0].length-1;
//	        int te = arr.length*arr[0].length;
//	        int count = 0;
//	        while(count < te)
//	        {
//	            for(int i = mincol;i <= maxcol && count < te;i++)
//	            {
//	                System.out.print(arr[minrow][i]+", ");
//	                count++;
//	            }
//	            minrow++;
//	              for(int i = minrow;i <= maxrow && count < te;i++)
//	            {
//	                System.out.print(arr[i][maxcol]+", ");
//	                count++;
//	            }
//	            maxcol--;
//	            for(int i = maxcol;i >= mincol && count < te;i--)
//	            {
//	                System.out.print(arr[maxrow][i]+", ");
//	                count++;
//	            }
//	            maxrow--;
//	              for(int i = maxrow;i >= minrow && count < te;i--)
//	            {
//	                System.out.print(arr[i][mincol]+", ");
//	                count++;
//	            }
//	            mincol++;
//	        }
//	        System.out.print("END");
		int [][] arr = { {1,2,3},{4,5,6},{7,8,9}};
		Spiral(arr);
		System.out.println(al);
//

	}
	public static ArrayList<Integer> al = new ArrayList<>();
	    public static void Spiral(int [][] arr)
	    {
	       int minrow = 0;
		        int maxrow = arr.length-1;
		        int mincol = 0;
		        int maxcol = arr[0].length-1;
		        int te = arr.length*arr[0].length;
		        int count = 0;
		        while(count < te)
		        {
		            for(int i = mincol;i <= maxcol && count < te;i++)
		            {
		                al.add(arr[minrow][i]);
		                count++;
		            }
		            minrow++;
		              for(int i = minrow;i <= maxrow && count < te;i++)
		            {
	                    al.add(arr[i][maxcol]);
		               // System.out.print(arr[i][maxcol]+", ");
		                count++;
		            }
		            maxcol--;
		            for(int i = maxcol;i >= mincol && count < te;i--)
		            {
	                    al.add(arr[maxrow][i]);
		                //System.out.print(arr[maxrow][i]+", ");
		                count++;
		            }
		            maxrow--;
		              for(int i = maxrow;i >= minrow && count < te;i--)
		            {
	                      al.add(arr[i][mincol]);
		               // System.out.print(arr[i][mincol]+", ");
		                count++;
		            }
		            mincol++;
	            }
	    }

}
