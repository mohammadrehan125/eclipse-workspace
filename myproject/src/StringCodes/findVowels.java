package StringCodes;

public class findVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int f = FV("sky");
		System.out.println();
		System.out.print(f);
	}
	
	public static int FV(String st)
	{
		String s = st.toLowerCase();
		int count = 0;
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u')
			{
				count++;
				System.out.print(ch+",");
			}
		}
		if(count == 0)
		{
			System.out.print("No vowels");
		}
		return count;
	}

}
