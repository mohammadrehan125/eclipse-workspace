package lacture4;

import java.util.Scanner;

public class LovesPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int row = 1;
	        int nst = 1;
         int val = 1;
	        while(row <= N)
	        {
	        	 int cst = 1;
		            while(cst <= nst)
		            {
		            	if(cst != 1&&cst != nst)
		            	{
		            		
		            		 System.out.print("0");
		            	}
		            	else
		            	{ 
                        System.out.print(val); 
		                
		            	}
		            	cst++;
	    
		            }
             System.out.println();
	            nst++;
           if(row>=2)
           {
	            val++;
           }
           row++;
	        }
	}

}
