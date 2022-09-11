package lacture1;
import java.util.Scanner;

public class VariablesDemo {

	public static void main(String[] args) {
		//System.out.print("welcom to java");
		// TODO Auto-generated method stub
	//	int x;
		//int y,z;
	//	x=4;
		//y=5;
		//z=6;
      // System.out.println(x);
      // System.out.println(y);
       //System.out.println(z);
		   Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        if(a>b&&a>c)
	        {
	            System.out.print(a);

	        }
	        else if(b>c)
	        {
	            System.out.print(b);
	        }
	        else
	        {
	            System.out.print(c);
	        }
	}

}
