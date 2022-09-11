package DoubtClass1;

import java.util.ArrayList;
import java.util.Collections;

public class RecursionAllsubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		al = new ArrayList<>();
		
		RLS("ab","");
		Collections.sort(al);
		for(String val:al)
			System.out.println(val);
		
	}
	public static ArrayList<String>al;
	
	public static ArrayList<String> RLS(String st,String ans)
	{
		if(st.length() == 0)
		{
			//System.out.println(ans);
			al.add(ans);
		}
		else
		{
			char ch = st.charAt(0);
			RLS(st.substring(1),ans+ch);
			RLS(st.substring(1),ans);
		}
		return al;
	}

}
