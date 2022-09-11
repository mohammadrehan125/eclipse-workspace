package lecture14;

public class StringCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "nitin";

		String s = "the sky is blue";
		//System.out.println(isPalindrome2(str));
		System.out.println(reverseByWords2(s));
	}
	
	public static boolean isPalindrome(String s)
	{
		int i = 0;
		int j = s.length()-1;
		if(s.charAt(i) != s.charAt(j))
		{
			return false;
			
		}
		i++ ;
		j--;
		
		return true;
	}
	
	public static boolean isPalindrome2(String s)
	{
		
		String str = reverse(s);
		
		return s.equals(str);
		
	}
	public static String reverse(String s)
	{
		String ans = "";
		for(int i = s.length()-1;i>=0;i--)
		{
			ans += s.charAt(i);
		}
		return ans;
	}
	public static String reverseByWords(String s)
	{
		String ans = "";
		int j = s.lastIndexOf(' ');
		while(j >= 0)
		{
			ans += s.substring(j+1)+" ";
			s = s.substring(0,j);
			j = s.lastIndexOf(' ');
		}
		ans += s.substring(0);
		return ans;
	}
	
	public static String reverseByWords2(String s)
	{
		String rs[] = s.split(" ");
		String ans = "";
		for(int i = rs.length-1; i >= 0; i--)
		{
			ans += rs[i]+" ";
		}
		return ans;
	}
}
