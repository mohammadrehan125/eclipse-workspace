package lecture11;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3};
		printSubArray(arr);

	}
	public static void printSubArray(int []arr)
	{
		int sum = 0;
		for(int i =0;i<=arr.length-1;i++)
		{
			for(int j = i;j<=arr.length-1;j++)
			{
				for(int k = i;k<=j;k++)
				{	
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
