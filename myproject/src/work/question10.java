package work;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n,1));

	}
	
	public static int fact(int n, int ans)
	{
		
		if(n == 0)
		{
			return ans;
		}
		else
		{
			return fact(n-1,ans*n);
		}
	}

}
