package StringCodes;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World ";
		System.out.println(LOLW(str));
		

	}
	public static int LOLW(String st)
	{
		
		int s = st.length();
		for(int i = s-1;i >= 0;i--)
		{
			if(st.charAt(i) != ' ')
			{
				int c = 0;
				while(i >= 0 && st.charAt(i) != ' ')
				{
					c++;
					i--;
					
				}
				return c;
			}
		}
		return 0;
	}

}
