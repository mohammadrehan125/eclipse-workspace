package lacture5;
import java.util.*;

public class DtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int multi = 1;
	        int ans = 0;
	        while(N!=0)
	        {
	            int rem = N%2;
	            ans = rem*multi+ans;
	            N = N/2;
	            multi = multi*10;
	            
	        }
	         System.out.print(ans);

	}

}
