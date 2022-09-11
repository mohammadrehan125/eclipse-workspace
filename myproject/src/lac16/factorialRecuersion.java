package lac16;

public class factorialRecuersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact(5));
		System.out.println(facttail(5,1));
	}
	public static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		return n*fact(n-1);
	}

	public static int facttail(int n,int ans)
	{
		if(n == 0)
		{
			return ans;
		}
		
		return facttail(n-1,n*ans);
	}
}
