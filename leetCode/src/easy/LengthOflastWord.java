package easy;

public class LengthOflastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   fly me   to   the moon  ";
		
		int s = str.length();
		for(int i = s-1; i >= 0;i--)
		{
			if(str.charAt(i) != ' ')
			{
				int c = 0;
				while(str.charAt(i) != ' ')
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
