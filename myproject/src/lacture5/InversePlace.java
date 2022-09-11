package lacture5;
import java.util.*;
//import java.lang.Math;

public class InversePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int ans = 0;
	        int place = 1;
	        while(N != 0)
	        {
	            int rem = N%10;
	            ans = place*(int)Math.pow(10,rem-1)+ans;
	            N = N/10;
	            place++;
	        }
	        System.out.print(ans);

	}

}
