package Backtracking;

public class CoinChangeCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder();
		int [] arr = {1,2,5};
//		System.out.println(CoinChange(new int[]{1,2,5},5,"", 0));
		coins(arr, 5, st, 0);

	}
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
	
	public static int CoinChange(int arr[],int amt,String ans,int lastind)
	{
		
		if(amt == 0)
		{
			//System.out.println(ans);
			return 1;
		}
		int count = 0;
		for(int i = lastind;i <arr.length;i++)
		{
			if(amt >= arr[i])
			{
				count += CoinChange(arr, amt-arr[i],ans+arr[i], i);
			}
		}
		return count;
	}
	public static void coinsC(int[]coins,int sum,String ans,int Wcoin)
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
			coinsC(coins,sum-coins[Wcoin],ans+coins[Wcoin]+" ",Wcoin);
			coinsC(coins,sum,ans,Wcoin+1);
		}
	}
	
}
