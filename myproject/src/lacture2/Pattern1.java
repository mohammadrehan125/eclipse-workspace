package lacture2;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int row = 1;
	        int nst = 5;
	        while(row <= N)
	        {
	        	 int cst = 1;
		            while(cst <= nst)
		            {
		            
		            		System.out.print("*");
		            	
		            	
		            	cst++;
		            }
	 
	           
	            row++;
	          System.out.println();
	        }

	}

	
}
