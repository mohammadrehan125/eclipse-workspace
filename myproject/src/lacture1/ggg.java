package lacture1;

public class ggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n = 5; 
//		int row = 1;
//		int nst  = 1;
//		int nsp = n-1;
//		int val = 1;
//		while( row<=n)
//		{
//			int csp = 1;
//			while(csp <= nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			int cst = 1;
//			while(cst <= nst)
//			{
//				if(cst%2 == 0)
//				{
//					System.out.print("! ");
//				}
//				else
//				{
//					System.out.print("* ");
//				}
//				cst++;
//			}
//			
//				row++;
//				nst += 2;
//				nsp--;
//					
//			System.out.println();
//		}
		
//		int n = 5; 
//		int row = 1;
//		int nst  = 1;
//		int nsp = n-1;
//		int val = 1;
//
//		while( row<=2*n-1)
//		{
//			int csp = 1;
//			while(csp <= nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			int cst = 1;
//			while(cst <= nst)
//			{
//				System.out.print("* ");
//				cst++;
//			}
//			
//			if(row <= n-1)
//			{
//				nst--;
//				nsp+=2;
//			}
//			else
//			{
//				nst++;
//				nsp-=2;
//			}
//			row++;
//					
//			System.out.println();
//		}
//		int n = 5; 
//		int row = 1;
//		int nst  = n;
//		int nsp = n-1;
//		int val = 1;
//		while( row<=2*n-1)
//		{
//			int csp = 1;
//			while(csp <= nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			int cst = 1;
//			while(cst <= nst)
//			{
//				System.out.print("* ");
//				cst++;
//			}
//			
//			if(row <= n-1)
//			{
//				nst--;
//				nsp--;
//			}
//			else
//			{
//				nst++;
//				nsp++;
//			}
//			row++;
//					
//			System.out.println();
//		}
		int n = 5; 
		int row = 1;
		int nsp1  = 0;
		int nsp2 = n-2;
		
		while(row <= n)
		{
			int csp1 = 1;
			while(csp1 <= nsp1)
			{
				System.out.print(" ");
				csp1++;
			}
			
			System.out.print("*");
			
			int csp2 = 1;
			while(csp2 <= nsp2)
			{
				System.out.print(" ");
				csp2++;
			}
			
			if(row != n/2+1)
				System.out.print("*");
	
			if(row <= n/2)
			{
				nsp1++;
				nsp2-=2;
			}
			else
			{
				nsp1--;
				nsp2+=2;
			}
			row++;
			System.out.println();
		}

	}
}
