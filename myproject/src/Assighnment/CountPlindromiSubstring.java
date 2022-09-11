package Assighnment;

public class CountPlindromiSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		System.out.println(palindromicSub(s));
	}
	public static int palindromicSub(String st)
	{
		int count = 0;
		for(int i =0; i < st.length(); i++)
		{
			for(int j=i; j <st.length(); j++)
			{
				String s = st.substring(i,j+1);
				if(isPalindrome(s))
				{
					count++;
				}
			}
		}
		return count;
	}

	public static boolean isPalindrome(String s)
	{
		int i = 0;
		int j = s.length()-1;
		if(s.charAt(i) != s.charAt(j))
		{
			return false;
		}
		else
		{
			i++;
			j--;
		}	
		return true;
	}
}
