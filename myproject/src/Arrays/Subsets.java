package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] arr = {1,2,3};
//		
//		ArrayList<Integer> al = new ArrayList<>();
//		ArrayList<List<Integer>> ll = new ArrayList<List<Integer>>();
//		sub(arr, 0, al, ll);
//		System.out.println(ll);
		
//		System.out.println(bin("11","1"));
//		System.out.println(pp("ababbbabbababa",""));
//		pp("nitin","");
		
//		ss("abc");
//		System.out.println(ss1("Hllsss"));
		System.out.println(isPrime(6));
		int [] arr = {1,5,4,2,3};
		sort(arr);
		
	}
	public static void sort(int [] arr)
	{
		for(int i = 0;i <arr.length;i++)
		{
			for(int j = i+1;j < arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static boolean isPrime(int n)
	{
		for(int i = 2;i*i<=n;i++)
		{
			if(n%i ==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean ss1(String s)
	{	
		s = s.toLowerCase();
		for(int i = 0;i <s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a'||ch == 'i'||ch =='o'||ch == 'e'||ch == 'u')
			{
				return true;
			}
		}
		return false;
	}
	public static void ss(String s)
	{
//		StringBuilder sb = new StringBuilder();
//		char [] arr = s.toCharArray();
//		for(int i = arr.length-1;i >= 0;i--)
//		{
//			sb.append(arr[i]);
//		}
//		System.out.println(sb.toString());
		
		String st = "";
		for(int i = s.length()-1;i>=0;i--)
		{
			st += s.charAt(i);
		}
		System.out.println(st);
	}
	
	 public static int pp(String s, String ans)
	 {
	      if(s.length() == 0)
	      {
	    	  System.out.println(ans);
	        	return 1 ;
	      }
	      else
	      {
	    	  int c = 0;
	    	  for(int i = 1; i <= s.length();i++)
	    	  {
	    		  String na = s.substring(0,i);
	    		  if(isPalindrome(na))
	    			  c+= pp(s.substring(i),ans+na+" ");
	          }
	          return c;
	      }
	 }
	 public static boolean isPalindrome(String s)
	 {
		 int i = 0;
		 int j = s.length()-1;
		 while(i < j)
		 {
			 if(s.charAt(i) != s.charAt(j))
			 {
				return false;
			 }
			 i++;
			 j--;
		 }
		 return true;
	 }
	
	 public static String bin(String s1, String s2) {
	        StringBuilder sb = new StringBuilder();
	      int i = s1.length()-1;
			int j = s2.length()-1;
			int c = 0;
			while(i >= 0||j>=0)
			{
				int sum = c;
				if(i >= 0)
				{
					sum += s1.charAt(i)-'0';
				}
				if(j >= 0)
				{
					sum += s2.charAt(j);
				}
				sb.append(sum%2);
				
				c = sum/2;
				i--;
				j--;
			}
			
			if(c != 0)
			{
				sb.append(c);
			}
	        return sb.toString();
	        
	    }
	public static void sub(int [] arr,int i , ArrayList<Integer>al,ArrayList<List<Integer>>ans)
	{
		if(i == arr.length)
		{
			ans.add(new ArrayList<Integer>(al));
			return ;
		}
		
	// choose nhi karenge	
		sub(arr, i+1, al, ans);
	// choose karenge	
		al.add(arr[i]);
		sub(arr, i+1, al, ans);
		al.remove(al.size()-1);
		
	}

}
