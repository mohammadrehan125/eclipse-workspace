package lacture4;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int row = 1;
	        int nst = 5;
	        int val = 1;
	        while(row <= N)
	        {
	        	 int cst = 1;
		            while(cst <= nst)
		            {
		     		System.out.print(cst+" ");
		     		val++;
		            	cst++;
		            }
	          row++;
	          cst++;
	          System.out.println();
	        }

	}

}
