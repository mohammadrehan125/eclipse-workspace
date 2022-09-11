package lecture21;

public class CoinChangeWithRespectCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder();
		int[]coins = {2,3,5,7};
		coins(coins,10,st,0);

	}
	
	public static void coins(int[]coins,int sum,String ans,int Wcoin)
	{
		if(sum == 0)
		{
			System.out.println(ans);
		}
		else if(sum < 0 || Wcoin >= coins.length)
		{
			return;
		}
		else
		{
			coins(coins,sum-coins[Wcoin],ans+coins[Wcoin]+" ",Wcoin);
			coins(coins,sum,ans,Wcoin+1);
		}
	}
// StringBuilder se 
	public static void coins(int[]coins,int sum,StringBuilder ans,int Wcoin)
	{
		if(sum == 0)
		{
			System.out.println(ans);
		}
		else if(sum < 0 || Wcoin >= coins.length)
		{
			return;
		}
		else
		{
			ans.append(coins[Wcoin]);
			ans.append(' ');
			coins(coins,sum-coins[Wcoin],ans,Wcoin);
			ans.delete(ans.length()-2,ans.length());
			coins(coins,sum,ans,Wcoin+1);
		}
	}

}
