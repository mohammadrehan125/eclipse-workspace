package lacture1;
import java.util.*;
public class CheackPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner sc = new Scanner(System.in);
		        int N = sc.nextInt();
		        int n = 2;
		  while(n<=N)
		  {
	        int flag = 1;
	        int i = 2;
	        while(i<n)
	        {
	            if(n%i==0)
	            {
	                flag = 0;
	                break;
	            }
	            i++;
	        }
	        if(flag==1)
	        {
	         
	        
	        System.out.println(n);
		  }
	        n++;
		  }
	}

}
