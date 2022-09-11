package work;

import java.util.Scanner;

public class quetion9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int flag = 1;
			for(int j = 2; j<n-1;j++)
			{
				if(n%j == 0)
				{
					flag = 0;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.println("PRIME");

			}
			else
			{
				System.out.println("NOT PRIME");
			}
			

	}

}
