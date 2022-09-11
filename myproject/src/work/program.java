package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= 45;
		int n = 45;
		int g = 1;
		//System.out.println(fabo(g));
		
//		String s = "abcd";
//		char [] arr = s.toCharArray();
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int i = 0;i<9;i++)
//		{
//			int a = sc.nextInt();
//			list.add(a);
//		}
//		int k = 3;
//		System.out.println(thn(list,k));
//		String st = "abbcddefggiijj";
//		fd(st);
		
		String d = "Programming";
		String str = "";
		for(int i = 0; i <d.length();i++)
		{
			if(d.charAt(i) != 'm')
			{
				str += d.charAt(i);
			}
		}
		System.out.println(str);
		
		
	}
	// in fibonacci series indexing start with zero
	
	public static int fabo(int n)
	{
		if(n == 1||n == 0)
		{
			return n;
		}
		else
		{
			return fabo(n-1)+fabo(n-2);
		}
		
		
		
	}
	
	public static void fd(String s)
	{
		int ans =0;
		for(int i = 0;i<s.length();i++)
		{	int flag = 0;
			for(int j = i+1;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{	ans = i;
//					System.out.println(s.charAt(i));
//					break;
				}
			}
//			if(flag == 1)
//			{
//				break;
//			}
		}
		System.out.println(s.charAt(ans));
	}
	
	public static int thn(List<Integer> ll,int k )
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(int val : ll)
		{
			if(val%2 == 0)
				al.add(val);
		}
//{		1st method
		Collections.sort(al);
		int n = al.size();
//		System.out.println(al.get(n-3));
		
		int l = al.get(n-3);
		return l;
	//}	
//	2nd method

//		int n = al.size();
//		int [] arr = new int[n];
//		for(int i = 0; i<n;i++)
//		{
//			arr[i] = al.get(i);
//		}
//		for(int i = 0; i<arr.length;i++)
//		{
//			for(int j = i+1;j<arr.length;j++)
//			{
//				if(arr[i] < arr[j])
//				{
//					int t = arr[i];
//					arr[i] =arr[j];
//					arr[j] =t;
//				}
//			}
//			if(i == k-1)
//			{
//				System.out.println(arr[i]);
//				break;
//			}
//		}
		
	}

}
