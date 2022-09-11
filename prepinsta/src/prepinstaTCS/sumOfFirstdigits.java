package prepinstaTCS;

public class sumOfFirstdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 2345;
//		sum(n);
		int [] arr = {1,2,3,4,5,-9};
		sqrt(arr);
		System.out.println(Math.abs(-6));
		
	}
	
//sum of perfect square number	
	public static void sqrt(int [] arr)
	{
		int sum = 0;
		for(int i = 0; i <arr.length;i++)
		{
			int s = Math.abs(arr[i]);
			int x = (int)(Math.sqrt(s));
			if(s == x*x)
			{
				sum += s;
			}
		}
		System.out.println(sum);
	}
// sum of given range
	public static void sum1(int n,int m)
	{
		int sum= 0; 
		for(int i = n;i<=m;i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
	public static void sum(int n)
	{
		int a = nod(n);
		
		int arr[] = new int[a];
		int i = 0;//arr.length-1;
		while(n!=0)
		{
			int rem = n%10;
			arr[i] = rem;
			i++;
			n = n/10;
		}
		int sum =0 ;
		int c= 0;
		for(int j = arr.length-1 ; j>=0;j--)
		{
			sum = sum+arr[j];
			c++;
			if(c==3)
			{
				break;
			}
		}
		System.out.println(sum);
	}
	public static int nod(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return (int)Math.log10(n)+1;
	}

}
