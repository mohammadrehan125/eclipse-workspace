package lacture4;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row =1;
		int nst = 1;
		int nsp = n-1;
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("1 ");
				cst++;
			}
			System.out.println();
			row++;
			nsp--;
			nst +=2;
		}

	}

}
