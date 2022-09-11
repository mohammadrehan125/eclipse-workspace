package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int j = 0; j <n;j++)
		{
			arr[j] = sc.nextInt();
		}
		HashSet<Integer> set=new HashSet<Integer>();
    	for(int i=0;i<arr.length;i++) {
    		set.add(arr[i]);
    	}
    	
    	int t=set.size();
    	
    	int[] ans=new int[t];
    	int i=0;
    	for(int val : set) {
    		ans[i]=val;
    		i++;
    	}
    	for(int k = 0; k < ans.length;k++)
    	{
    		System.out.print(ans[k]+" ");
    	}
	}
}
