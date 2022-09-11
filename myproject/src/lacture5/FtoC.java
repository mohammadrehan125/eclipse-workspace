package lacture5;
import java.util.*;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int multi = 1;
	        int ans = 0;
	        while(N!=0)
	        {
	            int rem = N%10;
	            ans = rem*multi+ans;
	            N = N/10;
	            multi = multi*2;
	            
	        }
	        System.out.print(ans);

	}

}
