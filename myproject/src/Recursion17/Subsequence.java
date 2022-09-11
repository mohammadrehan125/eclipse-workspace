package Recursion17;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(ss("abc"));
		
		ss2("abc","");

	}
//1st	
	public static ArrayList<String> ss(String st)
	{
		if(st.length() == 0)
		{
			return new ArrayList<String>(Arrays.asList(""));
		}
		else
		{
			char ch = st.charAt(0);
			ArrayList<String> rr = ss(st.substring(1));
			ArrayList<String> nr = new ArrayList<>();
			
			for(String val : rr)
			{
				nr.add(val);
				nr.add(ch+val);
			}
			return nr;
		}
	}

//2nd
	public static void ss2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			if(ans.length()!= 0)//if we don't want to print blank string
				System.out.println(ans);
		}
		else
		{
			char ch = ques.charAt(0);
			ss2(ques.substring(1),ans);
			ss2(ques.substring(1),ans+ch);
			
		}
	}
}
