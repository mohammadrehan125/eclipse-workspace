package lacture5;

import java.util.Scanner;

public class PascleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =0;
		int nst = 1;
		int val =1;
		while(row<n)
		{
		
			
			int cst =0;
			while(cst<nst)
			{
				System.out.print(val+" ");
				cst++;
				val = (row-cst+1)*val/cst;
			}
			
			
	        System.out.println();
			
			row++;
			nst++;
			val =1;
		   }

	}

}
