package lac16;

public class SubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asciiss("ab","");

	}
	public static void ss2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.print(ans+" ");
		}
		else
		{
			char ch = ques.charAt(0);
			ss2(ques.substring(1),ans+(int)ch);
			ss2(ques.substring(1),ans);
			ss2(ques.substring(1),ans+ch);
		}
	}
	public static int Asciiss(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			char ch = ques.charAt(0);
			int count = 0;
			count += Asciiss(ques.substring(1),ans+ch);
			count += Asciiss(ques.substring(1),ans);
			count += Asciiss(ques.substring(1),ans+(int)ch);
			return count;
		}
	}

}
