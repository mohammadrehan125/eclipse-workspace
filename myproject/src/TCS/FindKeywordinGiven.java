package TCS;

import java.util.Scanner;

public class FindKeywordinGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String str[] = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
		int flag = 0;		
		String input = sc.next();
		for(int i = 0;i< str.length;i++)
		{
			if(str[i].equals(input))
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println(input+" is a keyword");
		}
		else
		{
			System.out.println(input+" is not a keyword");
		}
				
				

	}

}
