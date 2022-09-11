package lacture20;

public class PalindromPartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		pp("nitin","");

	}
	public static boolean isPalindrom(String s)
	{
		int i = 0;
		int j = s.length()-1;
		while(i < j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}
		return true;
	}
	public static void pp(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i=1; i<=ques.length(); i++)
			{
				String na = ques.substring(0,i);
				if(isPalindrom(na))
				{
					pp(ques.substring(i),ans+na+" ");
				}
			}
		}
	}

}
