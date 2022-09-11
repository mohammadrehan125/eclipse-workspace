package lacture5;
import java.util.*;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        printArmStrong(1,1000);

	    }
	    public static int nod(int N)
	    {
	        return (int)Math.log10(N)+1;
	    }
	    public static void printArmStrong(int min,int max)
	    {
	    	for(int i =min; i<=max; i++)
	    	{
	    		if(isArmStrong(i))
	    		{
	    			System.out.println("true");
	    		}
	    	else
	    		{
	    			System.out.println("false");
	    		}
	    	}
	    }
	    public static boolean isArmStrong(int N)
	    {
	    	int ans = 0;
	        int nod = nod(N);
	        int temp =N;
	        while(temp!=0)
	        {
	            int rem = temp%10;
	            ans = (int)Math.pow(rem,nod)+ans;
	            temp /= 10;
	           
	        } return ans == N;
	        
	      }

	}


