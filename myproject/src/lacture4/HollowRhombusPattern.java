package lacture4;
import java.util.*;

public class HollowRhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nsd = n;
		int nsp = n-1;
		while(row<=n)
		{
			int csp = 1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int csd = 1;
			while(csd<=nsd)
			{
				if(csd == 1||csd == n||row == 1||row ==n)
				{
				System.out.print("*");
				csd++;
				}
				else
				{
					System.out.print(" ");
					csd++;
				}
			}
			row++;
			nsp--;
			System.out.println();
		}

	}

}
