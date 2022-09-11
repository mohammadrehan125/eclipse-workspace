package DP;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		
		int [][] dp = new int[n+1][n+1];
		
		//System.out.println(MazePRecursive(0, 0, n, n));
		System.out.println(MazePTD(0, 0, n, n,dp));

	}
	public static int MazePRecursive(int cr,int cc,int er,int ec)
	{
		if(cr == er&&cc == ec)
		{
			return 1;
		}
		else if(cr > er||cc > ec)
		{
			return 0;
		}
		int ch = MazePRecursive(cr,cc+1,er,ec);
		int cv = MazePRecursive(cr+1,cc,er,ec);
		return ch+cv;
	}
//DP solution 
	public static int MazePTD(int cr,int cc,int er,int ec,int [][]dp)
	{
		if(cr == er&&cc == ec)
		{
			return 1;
		}
		else if(cr > er||cc > ec)
		{
			return 0;
		}
		if(dp[cr][cc] != 0)
		{
			return dp[cr][cc];
		}
		int ch = MazePTD(cr,cc+1,er,ec,dp);
		int cv = MazePTD(cr+1,cc,er,ec,dp);
		
		dp[cr][cc] = ch+cv;
		return ch+cv;
	}

}
