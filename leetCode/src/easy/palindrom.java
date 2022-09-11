package easy;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1534236469;
		System.out.println(pd(n));
	}
	public static boolean pd(int x)
	{
		
		int k=x;
	    int rem = 0;
        int rev = 0;
        while(x > 0 && x==Integer.MAX_VALUE)
        {
            rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        if(rev == k)
        {
             return true;
        }
        else
        {
            return false;
        }
	}

}
