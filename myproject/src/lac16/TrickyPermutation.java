package lac16;

import java.util.Arrays;

public class TrickyPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aba";
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		TP(str, "");
		

	}
	public static void TP(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			
		}
		else
		{
			for(int i = 0;i <= ques.length()-1;i++)
			{
				boolean flag = true;
				for(int j = 0; j<i; j++)
				{
					if(ques.charAt(j) == ques.charAt(i))
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					String nq = ques.substring(0,i)+ques.substring(i+1);
					TP(nq,ans+ques.charAt(i));
				}
				
			}
		}
	}

}
