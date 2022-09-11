
package Assighnment;

import java.util.ArrayList;

public class KeyPadCombination {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "23";
		 KPC(str,"");
		System.out.println(al);
	//System.out.println(count);
	
	

	}
	 public static ArrayList<String> al = new ArrayList<>();
	public static String[] table = {"","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	//public static String[] table = {"","a","b","c", "d","e","f", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public static void KPC(String ques,String ans)
	{
		if(ques.length()== 0)
		{
			al.add(ans);
//			System.out.print(ans+" ");
			//System.out.println();
			//return 1 ;
		}
		else
		{
//			int count = 0;
			char ch = ques.charAt(0);
			String codeforS = table[ch-'0'];
			for(int i= 0; i<codeforS.length(); i++)
			{
				 KPC(ques.substring(1),ans+codeforS.charAt(i));
			}
			
		}
	}
	

}
