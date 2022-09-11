package Arrays;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcdef";
		System.out.println(ss(s));

	}
	public static String ss(String st)
	{
		String ans = "";
		for(int i = 0; i<st.length();i++)
		{
			char ch = st.charAt(i);
			for(int j = 0; j<st.length();j++)
			{
				if(ch != st.charAt(j))
				{
					ans = ch+"";
				}
			}
		}
		return ans;
	}

}
