package lacture5;
import java.util.*;

public class ReplaceZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int dig = 1;
        int rem;
        long ans=0;
        long j=n;
       long place=1;
        while(n!=0)
        {
            rem=(int)(n%10);
            
            if(rem==0)
            {
                ans=dig*place+ans;
            }
            else
            {
            	ans=rem*place+ans;
            }
            n=n/10;
            place*=10;    
        }
       
        if(j==ans)
        {
        	System.out.print("Zero is not present");
        }
        else
        {
        	System.out.print(ans);
        }

	}

}
