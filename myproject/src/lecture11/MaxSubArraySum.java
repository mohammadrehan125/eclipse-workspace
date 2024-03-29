package lecture11;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,-10,4,5,-7};
		System.out.println(MaxSubArraySum2(arr));

	}
	public static int MaxSubArraySum(int []arr)
	{
		int maxsum = Integer.MIN_VALUE;
		for(int i =0;i<=arr.length-1;i++)
		{
			for(int j = i;j<=arr.length-1;j++)
			{
				int sum = 0;
				for(int k = i;k<=j;k++)
				{
					sum += arr[k];   
				}
				maxsum = Math.max(sum, maxsum);
			}
		}
		return maxsum;
	}
	//SECOND MATHOD
	public static int MaxSubArraySum2(int []arr)
	{
		int maxsum = Integer.MIN_VALUE;
		for(int i =0;i<=arr.length-1;i++)
		{
			int sum = 0;
			for(int j = i;j<=arr.length-1;j++)
			{
				sum += arr[j];
				maxsum = Math.max(sum, maxsum);
			}
		}
		return maxsum;
	}

}
