package lac16;

public class TowerOfHannoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TOH(2,"T1","T2","T3"));

	}
	 public static int TOH(int N, String src,String dst,String aux)
	    {
	       
	        if(N == 0)
	        {
	        	
	            return 0;
	        }
	        else
	        {
	        	 int count = 1;
	            count += TOH(N-1,src,aux,dst);
	            System.out.println("Move " +N+ "th di from " +src+ " to " +dst);
	            count += TOH(N-1,aux,dst,src);
	            return count ;

	        }
	       
	    }

}
