package lacture4;
import java.util.*;
public class LovesPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int row = 1;
	        int nst = 1;
	      //  int nsp = 0;
	        while(row <= N)
	        {
	        	 int cst = 1;
		            while(cst <= nst)
		            {
		            	if(row%2 == 0&&cst != 1&&cst != nst)
		            	{
		                System.out.print("0");
		                
		            	}
		            	else
		            	{
		            		System.out.print("1");
		            	
		            	}
		            	cst++;
	    
		            }
	     //       nsp +=1;
	            nst++;
	           
	            row++;
	          System.out.println();
	        }

	}

}
