package lacture1;
import java.util.*;
public class PrintFabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
         int a=0,b=1,c=1;
         while(c<=N)
         {
            
            System.out.println(c);
              a=b;
             b=c;
             c=a+b;
              
         }

	}
	 

}
