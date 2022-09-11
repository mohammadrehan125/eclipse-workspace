package Assighnment;

import java.util.ArrayList;

public class RecursionCodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		al = new ArrayList<>();
		System.out.println(RCS("1125",""));

	}
	public static ArrayList<String>al;
	public static ArrayList<String> RCS(String st,String ans)
	{
		if(st.length() ==0)
		{
			al.add(ans);
		}
		else
		{
			char ch = st.charAt(0);
			char lett = (char)(ch -'1'+'a');
			RCS(st.substring(1),ans+lett);
			if(st.length() >= 2)
			{
				String ns= st.substring(0,2);
				int alp = Integer.parseInt(ns);
				if(alp <= 26)
				{
					RCS(st.substring(2),ans+(char)('a'+alp-1));
				}
				
			}
		}
		return al;
	}

}
