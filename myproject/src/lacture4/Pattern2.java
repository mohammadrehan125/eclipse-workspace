package lacture4;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = 1;
		
		while(row<=n)
		{
		
			
			int cst =1;
			while(cst<=nst)
			{
				System.out.print("* ");
				cst++;
				
			}
			
			
	        System.out.println();
			
			row++;
			nst++;
		   }

	}

}
