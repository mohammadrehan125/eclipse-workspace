package lacture4;

import java.util.Scanner;

public class MountainPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = 1;
		int nsp = 2*n-3;
		int val = 1;
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print(val+" ");
				val++;
				cst++;
			}
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			cst = 1;
			if(row == n)
			{
				cst =2;
				val--;
			}
			while(cst <= nst)
			{
				val--;
				System.out.print(val+" ");
				cst++;
			}
			row++;
			nst++;
			nsp -= 2;
			System.out.println();
		}

	}

}
