package StringCodes;

public class DuplicatCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		dc(str,"");

	}
	
	public static void dc(String st,String ans)
	{
		//String s = st;
		if(st.length() ==0)
		{
				System.out.println(ans);
		}
		else
		{
			ans += st.charAt(0)+"";
			for(int i = 1;i<st.length();i++)
			{
				char curr = st.charAt(i);
				char prev = st.charAt(i-1);
				if(curr == prev)
				{
					ans +="*"+curr;
					//dc(st.substring(i),ans);
				}
				ans += curr;
//				else
//				{
//					//ans +=curr;
//					dc(st.substring(i),ans);
//				}
			}
		}
		
	}

}
