package lacture5;
import java.util.*;

public class SumOfoddEvenPlaceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	       int pos=0;
			int sum1 = 0;
			int sum2=0;
			
			while(N!= 0)
			{
				int c=N%10;
				if(pos%2==0)
				{
					sum1+=c;
				}
				else 
				{
					sum2+=c;
				}
				N=N/10;
				pos++;
				
				
				
			}
			System.out.println(sum1);
			System.out.println(sum2);
			
		
	}

}
