package lacture4;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = n;
		//5int val = 1;
		
		while(row<=n)
		{
		
			
			int cst =1;
			while(cst<=nst)
			{
				System.out.print("* ");
				cst++;
				//val++;
			}
			
			
	        System.out.println();
			
			row++;
			
		   }
	}

}
