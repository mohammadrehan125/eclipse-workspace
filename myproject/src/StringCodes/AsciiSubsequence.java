package StringCodes;

public class AsciiSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//RLS("ab","");
		System.out.println(RLS("ab",""));
	}
	  public static int RLS(String st,String ans)
		{
			if(st.length() == 0)
			{
				System.out.print(ans+" ");
				return 1;
			}
			else
			{
				int count = 0;
				char ch = st.charAt(0);
				count += RLS(st.substring(1),ans);
				count += RLS(st.substring(1),ans+ch);
				count += RLS(st.substring(1),ans+(int)ch);
				
				
				return count;
				
			}
		}


}
