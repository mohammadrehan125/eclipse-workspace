package work;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isPalindrom(s));

	}
	
	
	public static boolean isPalindrom(String s)
	{
		int i = 0;
		int j = s.length()-1;
		
		while(i <j)
		{
			if(s.charAt(i)== s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		return true;
		
	}

}
