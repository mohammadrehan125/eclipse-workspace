package Backtracking;

public class CoinCh_Per {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinChange(new int[]{2, 3,5,6},10,"");

	}
	public static void CoinChange(int arr[],int amt,String ans)
	{
		if(amt == 0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i = 0;i <arr.length;i++)
		{
			if(amt >= arr[i])
			{
				CoinChange(arr, amt-arr[i],ans+arr[i]);
			}
		}
	}

}
