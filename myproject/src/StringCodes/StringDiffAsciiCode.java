package StringCodes;

public class StringDiffAsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "acb";
		System.out.println(SDAC(str));

	}
	public static String SDAC(String st)
	{
		String s = st.substring(0,1);
		for(int i = 1;i< st.length(); i++)
		{
			char curr = st.charAt(i);
			char prev = st.charAt(i-1);
			int gap = curr-prev;
			s += gap;
			s += curr;
		}
		return s;
	}

}
