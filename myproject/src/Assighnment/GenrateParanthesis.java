package Assighnment;

public class GenrateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenP(2,0,0,"");
		

	}
	public static void GenP(int N,int open,int close,String ans)
	{
		if(open == N&&close == N)
		{
			System.out.println(ans);
			return ;
		}
		else
		{
			if(open<N)
			{
				GenP(N,open+1,close,ans+"(");
			}
			if(open>close)
			{
				GenP(N,open,close+1,ans+")");
			}
		}
			
		
	}

}
