package DoubtClass1;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     
        	   lexo(n,0);
	}
        public static void lexo(int n, int count)
        {
        	if(count > n)
        	{
        		return ;
        	}
        	else
        	{
        		System.out.println(count+" ");
        		int i = 0;
    			if(count == 0)
    			{
    				i = 1;
    			}
    			for(;i<=9 ;i++)
    			{
        			lexo(n, count*10+i);
        		}
        	}
        }
}
