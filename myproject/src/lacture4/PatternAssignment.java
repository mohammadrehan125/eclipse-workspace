package lacture4;

import java.util.Scanner;

public class PatternAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
      int nsp = 0;
      int nst = 2*N+1;
      int val = N;
      while(row <= 2*N+1)
      {
    	  int csp = 1;
    	  while(csp <= nsp)
    	  {
    		  System.out.print("  ");
    		  csp++;
    	  }
    	  int cst = 1;
    	  int val1 = val;
    	  while(cst <= nst)
    	  {
    		  System.out.print(val1+" ");
    		  cst++;
    		  if(cst <= nst/2+1)
    		  {
    			  val1--;
    		  }
    		  else
    		  {
    			  val1++;
    		  }
    		  
    	  }
    	  System.out.println();
    	  row++;
    	  if(row <=N+1) {
    		  nsp++;
        	  nst -=2;
        	  val--;
    	  }
    	  else {
    	  nsp--;
    	  nst +=2;
    	  val++;
    	  }
      }
        	
        	
        	
        }

	}
