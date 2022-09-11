package lecture21;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2,3,5,7};
		StringBuilder st = new StringBuilder();
		System.out.println(CC(coin,0,10,st));

	}
	
// IMPLICIT BACKTRACKING*************
	public static int CC(int[] coin,int sum,String ans)
	{
		if(sum == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else if(sum < 0)
		{
			return 0;
		}
		else
		{
			int count = 0;
			for(int i = 0;i < coin.length;i++)
			{
				count += CC(coin,sum-coin[i],ans+coin[i]+" ");
			}
			return count;
		}
	}
// EXPLICIT BACKTRACKING**************
	public static int CC(int[] coin,int csf,int sum,String ans)
	{
		if(csf == sum)
		{
			System.out.println(ans);
			return 1;
		}
		else if(csf > sum)
		{
			return 0;
		}
		else
		{
			int count = 0;
			for(int i = 0;i < coin.length;i++)
			{
				csf += coin[i];
				count += CC(coin,csf,sum,ans+coin[i]+" ");
				csf -= coin[i];
			}
			return count;
		}
	}
// using StringBuilder	
	

	public static int CC(int[] coin,int csf,int sum,StringBuilder ans)
	{
		if(csf == sum)
		{
			System.out.println(ans);
			return 1;
		}
		else if(csf > sum)
		{
			return 0;
		}
		else
		{
			int count = 0;
			for(int i = 0;i < coin.length;i++)
			{
				ans.append(coin[i]);
				ans.append(' ');
				csf += coin[i];
				count += CC(coin,csf,sum,ans);
				csf -= coin[i];
				ans.delete(ans.length()-2,ans.length());
			}
			return count;
		}
	}
}
