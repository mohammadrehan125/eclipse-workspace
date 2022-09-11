package prepinstaTCS;

public class LongestPalindromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {141,154,11511,121};
		System.out.println(longest(arr));

	}
	
	public static boolean isPalindrome(int n)
	{
		int s = n;
		int rev = 0;
		while(n!=0)
		{
			int rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		return s==rev;
	}
	
	public static int longest(int [] arr)
	{
		int temp ;
		for(int k = 0;k <arr.length;k++)
		{
			for(int l = 0;l < arr.length;l++)
			{
				if(arr[k] > arr[l])
				{
					temp = arr[k];
					arr[k] = arr[l];
					arr[l] = temp;
					
				}
			}
		}
		for(int i = 0; i < arr.length;i++)
		{
			if(isPalindrome(arr[i]))
			{
				return arr[i];
			}
		}
		return -1;
	}

}
