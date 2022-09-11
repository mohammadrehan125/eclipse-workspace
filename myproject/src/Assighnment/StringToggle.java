package Assighnment;

public class StringToggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "RehaN";
		System.out.println(toggle(str));
	}
	public static String toggle(String st)
	{
		StringBuilder sb = new StringBuilder(st);

		for(int i = 0;i<sb.length();i++)
		{
			char ch = sb.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				char uc = (char)('A' + ch - 'a');
				sb.setCharAt(i, uc);
			}
			else if(ch >= 'A' && ch <= 'Z')
			{
				char lc = (char)('a' + ch - 'A');
				sb.setCharAt(i, lc);
			}
		}
		return sb.toString();
	}

}
