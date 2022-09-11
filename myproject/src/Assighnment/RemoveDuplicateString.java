package Assighnment;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabccba";
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
			if(curr != prev)
			{
				s += curr;
			}
		}
		return s;
	}
}
