
package StringCodes;


public class StringOddEvenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcg";
		System.out.println(OEC(str,""));

	}
	public static String OEC(String st,String ans)
	{
		if(st.length() == 0) {
			return ans;
		}
		else
		{
			for(int i = 0; i < st.length(); i++)
			{
				char ch = st.charAt(i);
				if(i%2 == 0)
				{
					ans += (char)(ch+1);
				}
				else
				{
					ans += (char)(ch-1);
				}
			}
		}
		return ans;
	}

}
