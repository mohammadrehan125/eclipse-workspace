package lacture4;

import java.util.Scanner;

public class InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = 1;
		int nsp = 2*n-1;
		int val = n;
		while(row <= 2*n+1)
		{
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print(val+" ");
				val--;
				cst++;
			}
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			cst = 1;
			if(row == n+1)
			{
				cst =2;
				val++;
			}
			while(cst <= nst)
			{
				val++;
				System.out.print(val+" ");
				cst++;
			}
			if(row < n+1)
			{
			nst++;
			nsp -= 2;
			}
			else
			{
			nst--;
			nsp +=2;
			}
			row++;
			System.out.println();
		}
	
	}

}
