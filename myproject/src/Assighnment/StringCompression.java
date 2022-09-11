package Assighnment;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbccds";
		System.out.println(comp(str));

	}
	public static String comp(String str)
	{
		String s = str.charAt(0)+"";
		int count = 1;
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
				if(count>1)
				{
					s += count;
					count = 1;
				}
				s += curr;
			}
			
		}
		if(count>1)
		{
			s += count;
			count = 1;
		}
		
		return s;
	}

}
