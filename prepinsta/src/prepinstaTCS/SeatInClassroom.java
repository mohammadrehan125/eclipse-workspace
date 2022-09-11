package prepinstaTCS;

import java.util.Scanner;

public class SeatInClassroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int fact = 1;
		for(int i= 0; i<n;i++)
		{
			fact *= (n-i);
		}
		
		
		int fact1 = 1;
		for(int i= 0; i<n-r;i++)
		{
			fact1 *= (n-r-i);
		}
		int per = fact/fact1;
		System.out.println(per+" ways");
		
			//OR-------------------------
	}
//	 public static void main(String[] args)  
//     {  
//         int n, r, per, fact1, fact2;  
//         Scanner sc =  new Scanner(System.in);  
//         System.out.println(“Enter the Value of n and r”);  
//         n = sc.nextInt();  
//         r = sc.nextInt();  
//         fact1 = n;  
//         for (int i = n – 1; i >= 1; i=i-1)  
//         {  
//             fact1 = fact1 * i;  //calculating factorial (n!)
//         }  
//         int number;  
//         number = n – r;  
//         fact2 = number;  
//         for (int i = number – 1; i >= 1; i=i-1)  
//         {  
//             fact2 = fact2 * i;  //calculating factorial ((n-r)!)
//         }  
//         per = fact1 / fact2;  //calculating  nPr
//         System.out.println(per+“ways”);  
// }  

}
