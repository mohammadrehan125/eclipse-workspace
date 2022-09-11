package easy;

public class StrinRevByWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "  hello world  ";
		System.out.println(rbw(str));

	}
	public static String rbw(String s)
	{
		//String s = "  hello world  ";
		int i = s.length()-1;
		String ans = "";
		int j = s.lastIndexOf(' ');
		while(j>0)
		{
		
				ans =ans+ s.substring(j+1)+" ";
			s = s.substring(0,j);
			j = s.lastIndexOf(' ');
		}
		//if(s.substring(0) != " ")
			ans += s.substring(0);
		
		return ans;
		//System.out.println(s);
	}
}
