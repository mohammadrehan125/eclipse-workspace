package lacture4;

import java.util.Scanner;

public class Apattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      
        int nst2=N;
        int row=1;
      
        while(row <= N)
        {
        	 
        	int cst = 1;
                  while(cst <= nst2)
                  {

                	  
                     if(row==1||row==N||cst==1||cst==N) {
                  	
                    System.out.print("*");
                    cst++;
                     }
                     else {
                     	
                        
                         	
                           System.out.print(" ");
                           cst++;
                         
                    	 
                     }
                  }
                  
             
            
             System.out.println();
            row++;
            
  
        }

	}
}


