package lacture5;
import java.util.*;

public class ArmStrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	              printbooleanoutput(N);
		        

	    }
	    public static void printbooleanoutput(int N)
	    {
	        if(isArmStrong(N))
	        {
	            System.out.println("true");
	        }
	        else
	        {
	          System.out.println("false");   
	        }
	    }
	    public static int nod(int N)
	   {
		        return (int)Math.log10(N)+1;
	    }
	       
	   public static boolean isArmStrong(int N)
       {
		    	int sum = 0;
		        int nod = nod(N);
	            int temp = N;

		        while(temp!=0)
		        {
		            int rem = temp%10;
		            sum = (int)Math.pow(rem,nod)+sum;
		            temp /=10;
		        } 
	            return sum == N;
	    }

}
