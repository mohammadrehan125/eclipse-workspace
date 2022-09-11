package lacture5;
import java.util.*;

public class LowerUpercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        char ch = sc.next().charAt(0);
	        char lowercse = 'L' ;
	        char uppercase = 'U';
	        char otherwise = 'I';
	        if(ch >= 'a'&& ch <= 'z')
	        {
	        	System.out.print("L");
	        }
	        else if(ch >= 'A' && ch <= 'Z')
	        {
	        	System.out.print("U");
	        }
	        else
	        {
	        	System.out.print("I");
	        }

	}

}
