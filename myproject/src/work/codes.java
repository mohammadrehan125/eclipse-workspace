package work;

public class codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 7;
		int nst = 1;
		int row = 1;
		int val = 1;
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				if(cst%2 == 0)
				{
					System.out.print("* ");
					
					
				}
				else
				{
					System.out.print(val+" ");
				}
				cst++;
			}
			
			System.out.println();
			
			if(row <= n/2)
			{
				nst+=2;
				val++;
			}
			else
			{
				nst-=2;
				val--;
			}
			row++;
			
		}

	}

}
