package Assighnment;

public class MaxFriquencyCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaaabbbccdddee"; 
		
		System.out.println(mfc(str));
	}
	public static char mfc(String str)
	{
		int count = 1;
		char ch = str.charAt(0);
		int max = 1;
		char mc = str.charAt(0);
		for(int i = 1;i< str.length();i++ )
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			if(curr == prev)
			{
				count++;
			}
			else
			{
				ch = curr;
				count = 1;
			}
			if(count > max)
			{
				max = count;
				mc = ch;
			}
			
		}
		return mc;
	}
}
