package work;

import java.util.Scanner;

public class quetion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		
		for(int i = 1;i<=row;i++)
		{
			for(int j = i; j< row;j++)
			{
				System.out.print("  ");
			}
			for(int k = 1; k<= 2*i-1;k++)
			{
				if(k == 1|| i == row||k == 2*i-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
