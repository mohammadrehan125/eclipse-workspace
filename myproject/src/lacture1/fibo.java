package lacture1;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fb(10);
	}
	public static void fb(int n)
	{
		int a=0;
		int b= 1;
		for(int i = 0; i<=n;i++)
		{
			System.out.println(a);
			int c= a+b;
			a=b;
			b= c;
					
		}
	}

}
