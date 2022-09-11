package Assighnment;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = n;
		int nsp=0;
        int nbr=1;
        int val=1;		
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(nbr+" ");
				csp++;
		                
			}
			int cst =1;
			int cval = val;
			while(cst<=nst)
			{
				System.out.print(cval+" ");
				cst++;
				cval++;
			}
			System.out.println();
		    nsp++;
		    nst--;
		    val++;
		    row++;
		    nbr++;
		}
	}
}
