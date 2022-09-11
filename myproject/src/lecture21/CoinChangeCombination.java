package lecture21;

public class CoinChangeCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2,3,5,7};
		System.out.println(CC(coin,10,"",0));

	}
	public static int CC(int[] coin,int sum,String ans,int lastid)
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
			for(int i = lastid;i < coin.length;i++)
			{
				count += CC(coin,sum-coin[i],ans+coin[i]+" ",i);
			}
			return count;
		}
	}

}
