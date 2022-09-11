package StringCodes;

import java.util.ArrayList;
import java.util.List;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "  the sky is blue  ";
		String str = "i.like.this.program.very.much";
//		String [] arr = str.split("\\.");
////        String st = "";
//	 System.out.println(arr.length);
		System.out.println(rs(str,""));

	}
	 
	//public static String rs(String st,String ans)
	public static String rs(String S,String st)
	{
		 String [] arr = S.split("\\.");
//	        String st = "";
		 System.out.println(arr.length);
	        for(int i = arr.length-1;i >= 0;i--)
	        {
	            if(st.length() != 0)
	            {
	                st = st+"."+arr[i];
	            }
	            else
	            {
	                st =st+arr[i];
	            }
	        }
	        return st;
//		int j = st.length()-1;
//		while(j >= 0)
//		{
//			while(j >= 0 && st.charAt(j) == ' ')
//			{
//				j--;
//			}
//			int i = j;
//			
//			while(j >= 0 && st.charAt(j) != ' ')
//			{
//				j--;
//			}
//			while(j < 0)
//			{
//				break;
//			}
//			if(ans.isEmpty())
//			{
//				ans += st.substring(j+1,i+1);
//			}
//			else
//			{
//				ans += " "+st.substring(j+1,i+1);
//			}
//		}
//		return ans;
		
	}
	
	
	

}
