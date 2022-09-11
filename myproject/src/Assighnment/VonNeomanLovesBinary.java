package Assighnment;
import java.util.*;
public class VonNeomanLovesBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			
			
			
			for(int i = 0; i < n; i++)
			{
				int multi = 1;
				int ans = 0;
				 int m = sc.nextInt();
		
			while( m!=0)
			{
				int rem = m%10;
				ans += rem * multi;
				m = m / 10;
				multi = multi * 2;
			}
				
			System.out.println(ans);
			}
	}
}
