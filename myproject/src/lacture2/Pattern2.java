package lacture2;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int row = 1;
	        int nd = 1;
	        int nst = N-1;
	        while(row < N)
	        {
	            int nsd = 1;
	            while(nsd <= nd)
	            {
	                System.out.print(nsd);
	                nsd++;

	            }
	            int cst = 1;
	            while(cst <= nst)
	            {
	                System.out.print("*");
	                cst++;
	            }
	            System.out.println();
	           
	            row++;
	            nd++;
	            nst--;
	        }

	}

}
