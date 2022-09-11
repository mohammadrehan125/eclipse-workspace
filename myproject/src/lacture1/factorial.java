package lacture1;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int ans = 1;
//		int fact = 1;
//		for(int i = 1; i<=n;i++)
//		{
//			fact = fact*i;
//			
//		}
//		System.out.println(fact);
		
		System.out.println(fact(n,1));

	}

	public static int fact(int n,int ans)
	{
		if(n==0)
		{
			return ans;
		}
		else
		{
			return fact(n-1,ans*n);
		}
	}
}
