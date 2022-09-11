package lacture4;
import java.util.*;
public class SquarePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int row = 1;
	        int  nst = 1;
	        while(row <=N){
	            int cst = 1;
	            while(cst <= nst){
	                if(row >=  N/2 && cst >= 2){
	                    System.out.print(cst * cst + " "  );
	                }
	                else {
	                    System.out.print("1" + " ");
	                }
	                cst++;
	            }
	            System.out.println();
	            row++;
	            nst++;
	        }


	}

}
