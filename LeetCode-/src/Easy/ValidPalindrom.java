package Easy;

public class ValidPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "A man, a plan, a canal: Panama";
		st = st.toLowerCase();
		System.out.println(isPalindrome(st));
		
		
	}
		public static boolean isPalindrome(String st)
		{
		StringBuilder s = new StringBuilder();
		for(int i = 0;i< st.length(); i++)
		{
			if(Character.isDigit(st.charAt(i)) || Character.isLetter(st.charAt(i)))
			{
				s.append(st.charAt(i));
			}
		}
	//	if(isPalindrome(s));
		System.out.println(s);
	    int i = 0 ;
		int j = s.length()-1;
		while(i < j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
