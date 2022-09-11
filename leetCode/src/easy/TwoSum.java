package easy;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < n;i++)
		{
			if(n/i == 0)
			{
				sum +=i;
			}
			
		}
		if(sum > n)
		{
			System.out.println(n+" is Abundant number");
		}
		else
		{
			System.out.println(n+" is not Abundant number");
		}

	}

}
