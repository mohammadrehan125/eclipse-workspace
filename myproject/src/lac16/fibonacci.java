package lac16;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		System.out.println(fib(n));
		System.out.println(fibtail(n,0,1));
	}
	
	
	public static int fib(int n)
	{
		if(n== 0 || n==1)
		{
			return n;
		}
		int f1 = fib(n-1)+fib(n-2);
		return f1;
	}
	public static int fibtail(int n,int a,int b)
	{
		if(n== 1)
		{
			return b;
		}
		
		return fibtail(n-1,b,a+b);
	}

}
