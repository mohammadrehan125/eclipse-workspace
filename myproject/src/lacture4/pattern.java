package lacture4;

import java.util.Arrays;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,5,6,7,0,1,2};
		System.out.println(search(arr, 0));
//		int n = 5;
//		int nst = 1;
//		int row = 1;
//		int val = 2;
//		char ch = 'A';
//		while(row <= n)
//		{
//			int cst = 1;
//			while(cst <= nst)
//			{
//				if(cst%2 == 0)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//				
//				if(row %2 == 0)
//				{
//					System.out.print(val+" ");
//				}
//				else
//				{
//					System.out.print(ch+" ");
//				}
//				}
//				cst++;
//			}
//			if(row %2 == 0)
//			{
//				val++;
//			}else
//			{
//				ch++;
//			}
//			row++;
//			nst += 2;
//			System.out.println();
//		}
	
//		int n = 5;
//		int row = 1;
//		int nst = n;
//		int nsp = 0;
		
//		while(row <= n)
//		{
//			int csp = 1;
//			while(csp <= nsp)
//			{
//				System.out.print("   ");
//				csp++;
//			}
//			
//			int cst = 1; 
//			while(cst <= nst)
//			{
//				System.out.print("*  ");
//				cst++;
//				
//			}
//			row++;
//			nsp+=2;
//			nst--;
//			System.out.println();
//					
//		}
		
//		int n = 5;
//		int row = 1;
//		int nst = n;
//		
//		while(row <= n)
//		{
//			int cst = 1;
//			while(cst <= nst)
//			{
//				if(cst == 1 || cst == nst|| row == 1||row == n)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//				cst++;
//			}
//			row++;
//			System.out.println();
//		}
		
//		int n = 5;
//		int row = 1;
//		int nsp1 = 0;
//		int nsp2 = n-1;
//	while(row <= n)	
//	{	int csp1 = 1;
//		while(csp1 <= nsp1)
//		{
//			System.out.print(" ");
//			csp1++;
//		}
//		
//		System.out.print("*");
//		
//		int csp2 = 1;
//		while(csp2 <= nsp2)
//		{
//			System.out.print(" ");
//			csp2++;
//		}
//		
//		if(row != n/2+1)
//			System.out.print("*");
//
//		if(row <= n/2)
//		{
//			nsp1++;
//			nsp2-=2;
//		}
//		else
//		{
//			nsp1--;
//			nsp2+=2;
//		}
//		row++;
//		System.out.println();
//		
//	}
		
//		int n = 5;
//		int row = 1;
//		int nsp = n-1;
//		int nst = 1;
//
//		while(row <= n)
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
//			row++;
//			nsp--;
//			nst+=2;
//			System.out.println();
//		}
//	
		
//		int n = 5;
//		int row = 1;
//		int nsp = n-1;
//		int nst = 1;
//
//		while(row <= n)
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
//			row++;
//			nst+=2;
//			nsp--;
//			System.out.println();
//		}

//		int n = 5;
//		int row = 1;
//		int nst = 1;
//		
//		while(row <= 2*n-1)
//		{
//			int cst = 1;
//			while(cst <= nst)
//			{
//				System.out.print("* ");
//				cst++;
//			}
//			
//			if(row <= n-1)
//			{
//				nst++;
//			}
//			else
//			{
//				nst--;
//			}
//			row++;
//			System.out.println();
//		}
	
//		int n = 5;
//		int row = 1;
//		int nst = 1;
//		int nsp=n-1;
//		
//		while(row <= 2*n-1)
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
//				nst++;
//				nsp--;
//			}
//			else
//			{
//				nst--;
//				nsp++;
//			}
//			row++;
//			System.out.println();
//		}
	
	
	
//	int n = 5;
//	int nsp = 0; 
//	int nst = n; 
//	int row = 1;
//	
//	while( row <= 2*n-1)
//	{
//		int csp = 1;
//		while(csp <= nsp)
//		{
//			System.out.print("  ");
//			csp++;
//		}
//		
//		int cst = 1;
//		while(cst <= nst)
//		{
//			System.out.print("* ");
//			cst++;
//		}
//		if(row <= n-1)
//		{
//			nst--;
//			nsp+=2;
//		}
//		else
//		{
//			nst++;
//			nsp-=2;
//		}
//		 row++;
//		 System.out.println();
//		
//	}
//		int n = 5;
//		int nsp = n-1; 
//		int nst = n; 
//		int row = 1;
//		
//		while( row <= 2*n-1)
//		{
//			int csp = 1;
//			while(csp <= nsp)
//			{
//				System.out.print("   ");
//				csp++;
//			}
//			
//			int cst = 1;
//			while(cst <= nst)
//			{
//				System.out.print("*  ");
//				cst++;
//			}
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
//			 row++;
//			 System.out.println();
//			
//		}
//		int n = 5;
//		int nsp = 2*n-2; 
//		int nst = 1;
//		int nst2= 1;
//		int row = 1;
//		
//		while(row <= n)
//		{
//			int cst = 1;
//			while(cst <= nst)
//			{
//				System.out.print("* ");
//				cst++;
//				
//			}
//			int csp = 1;
//			while(csp<= nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			int cst2 = 1;
//			while(cst2 <= nst2)
//			{
//				System.out.print("* ");
//				cst2++;
//				
//			}
//			
//			nst+=1;
//			nst2++;
//			nsp -=2;
//			row++;
//			System.out.println();
//			
//		}
		
//		int n = 7;
//		int nsp = -1; 
//		int nst = n/2+1;
//		int row = 1;
//		
//		while(row <= n)
//		{
//			
//			int cst = 1;
//			while(cst <= nst)
//			{
//				
//					
//				System.out.print("* ");
//				cst++;
//				
//			}
//			int csp = 1;
//			while(csp<= nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			
//			cst = 1;
//			if(row == 1||row == n)
//			{
//				cst = 2;
//			}
//			while(cst <= nst)
//			{
//				System.out.print("* ");
//				cst++;
//				
//			}
//			if(row <= n/2)
//			{
//				
//				nst-=1;
//				nsp +=2;
//			}
//			else
//			{
//				nst++;
//				nsp-=2;
//			}
//			
//			row++;
//			System.out.println();
//			
//		}
//		
//		int n = 7;
//		int nsp = 1; 
//		int nst = n/2;
//		int row = 1;
//		
//		while(row <= n)
//		{
//			
//			int cst = 1;
//			while(cst <= nst)
//			{
//				
//					
//				System.out.print("* ");
//				cst++;
//				
//			}
//			int csp = 1;
//			while(csp<= nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			
//			cst = 1;
//			while(cst <= nst)
//			{
//				System.out.print("* ");
//				cst++;
//				
//			}
//			if(row <= n/2)
//			{
//				
//				nst-=1;
//				nsp +=2;
//			}
//			else
//			{
//				nst++;
//				nsp-=2;
//			}
//			
//			row++;
//			System.out.println();
//			
//		}
		
//	int n = 7; 
//	int row = 1;
//	int nsp = n/2;
//	int nst = 1;
//	while(row <= n)
//	{
//		int csp = 1;
//		 while(csp <= nsp)
//		 {
//			 System.out.print("  ");
//			 csp++;
//		 }
//		 int cst = 1; 
//		 while(cst <= nst)
//		 {
//			 System.out.print("* ");
//			 cst++;
//		 }
//		 
//		 if(row <= n/2)
//		 {
//			 nsp--;
//			 nst+=2;
//		 }
//		 else
//		 {
//			 nsp++;
//			 nst -=2;
//		 }
//		 row++;
//		 System.out.println();
//	}
//	
//		int n = 5; 
//		int row = 1;
//		int nst = 1;
//		int val = 1;
//		while(row <= 2*n-1)
//		{
//			int cst = 1;
//			while(cst <= nst)
//			{
//				if(cst%2 == 0)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print(val+" ");
//					
//				}
//				cst++;
//			}
//			if(row <= n-1)
//			{
//				nst+=2;
//				val++;
//			}
//			else
//			{
//				nst-=2;
//				val--;
//			}
//			
//			row++;
//			System.out.println();
//		}
	
		
//		int n = 5; 
//		int nst = n;
//		int val = 5;
//		int row = 1;
//		while(row <= n)
//		{
//			int val2= 5;
////			int val2 = val;
//			int cst = 1;
//			 while(cst <= nst)
//			 {
//				 if(row+cst == n+1)
//					 System.out.print("* ");
//				 else
//					 System.out.print(val2+" ");
//				 cst++;
//				 val2--;
//			 }
	//	}

//			 
//			 row++;
//			 System.out.println();
//		}
			// 29pattern	
//		int n = 5;
//		int nst = 1;
//		int nsp = n-1;
//		int row = 1;
//		int val = 1;
//		while(row <= n)
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
//				if(cst == 1|| cst ==nst)
//					System.out.print(val+" ");
//				else
//					System.out.print(0+" ");
//				cst++;
//				
//			}
//			val++;
//			row++;
//			nsp--;
//			nst+=2;
//			System.out.println();
//		}
	// pattern 26
//		int n = 5;
//		int nst = 1;
//		int nsp = n-1;
//		int row = 1;
//		int val = 1;
//		while(row <= n)
//		{
//			int csp = 1;
//			while(csp <= nsp)
//			{
//				System.out.print("  ");
//				csp++;
//			}
//			int cst = 1;
//			int val1 = val;
//			while(cst <= nst)
//			{
//				System.out.print(val1+" ");
//				val1++;
//				cst++;	
//			}
//			row++;
//			nsp--;
//			nst+=2;
//			System.out.println();
//		}
//	     int N = 5;
//		 int row = 1;
//	     int  nst = 1;
//	     while(row <=N)
//	     {
//	        int cst = 1;
//	        while(cst <= nst)
//	        {
//	        	if(row >=  N/2 && cst >= 2)
//	        	{
//	                 System.out.print(cst * cst + " ");
//	                 
//	            }
//	        	else
//	        	{
//	                System.out.print("1" + " ");
//	                
//	            }
//	            cst++;
//	        }
//	        
//	        System.out.println();
//	        row++;
//            nst++;
//	     }

//		int n = 5;
//		int row = 1;
//		int a= 0;
//		int b= 1;
//		int nst = 1;
//		
//		while(row <= n)
//		{
//			int cst = 1;
//			while(cst <= nst)
//			{
//				System.out.print(a+" ");
//				int c = a+b;
//				a= b;
//				b=c;
//				cst++;
//			}
//			row++;
//			nst++;
//			System.out.println();
//				
//		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	 public static  int search(int[] arr, int target) {
	       for(int i = 0; i< arr.length;i++)
	       {
	    	   if(arr[i] == target)
	    	   {
	    		   return i;
	    	   }
	       }
	       return -1;
	        
	    }

}
