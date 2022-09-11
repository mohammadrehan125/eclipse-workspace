package prepinstaTCS;

public class CountNoWithUnitD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int start = 1;
//		int end = 45;
//		int k = 2;
//		int count = 0;
//		for(int i = start; i <= end;i++)
//		{
//			int rem = i%10;
//			if(rem == k)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
		
//		int [] arr = {6,0,1,8,0,2};
//		d(arr);
		factsum(10);

	}
	
	public static void factsum(int n)
	{
		int sum = 0;
		for(int i = 2;i <n;i++)
		{
			if(n%i == 0)
			{
				sum = sum*10+i;
			}
		}
		System.out.println(sum);
	}
	public static void d(int []arr)
	{
		int c = 0;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]!= 0)
			{
				arr[c] = arr[i];
				c++;
			}
		}
		while(c < arr.length)
		{
			arr[c] = 0;
			c++;
		}
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
