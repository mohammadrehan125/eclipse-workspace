package lacture4;

import java.util.Scanner;

public class SqarePatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = n;
		int val = 1;
		
		while(row<=n)
		{
		
			
			int cst =1;
			while(cst<=nst)
			{
				System.out.print(val+" ");
				cst++;
				
			}
			
			
	        System.out.println();
	        val++;
			row++;
			
		   }

	}

}
