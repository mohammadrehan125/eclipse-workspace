package lacture9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       int []arr2 = new int[N];
       int []arr1 = new int[N];
       
       for(int i=0;i<N;i++){
           arr1[i]=sc.nextInt();
       }
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i] = sc.nextInt();
        }
		  Arrays.sort(arr1);
	       Arrays.sort(arr2);
	       ArrayList<Integer> ans = new ArrayList<Integer>();
 
	       int i = 0;
	       int j = 0;
	       while(i<arr1.length && j<arr2.length)
	       {
             if(arr1[i] == arr2[j])
             {
                 ans.add(arr1[i]);
                 i++;
                 j++;
             }
             else if(arr1[i] < arr2[j])
             {
                 i++;
             }
             else
             {
                 j++;
             }
           
           }
          System.out.print(ans);
    }
}