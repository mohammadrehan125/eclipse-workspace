package Assighnment;

import java.util.Scanner;

public class RecursionLexicographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
	//	int N = sc.nextInt();
//		
//		for(int i = 1;i<10;i++)
//			Rl(10,i);
		Rl2(10,0);//0 se print krne ke liye
	}
	public static void Rl(int N,int count)
	{
		if(count > N)
		{
			return ;
		}
		else
		{
			System.out.println(count);
			
			for(int i = 0;i<=9 ;i++)
			{
				Rl(N,count*10+i);
			}
		
		}
	}
	
	// 0 se print krne ke liye
	
	public static void Rl2(int N,int count)
	{
		if(count > N)
		{
			return ;
		}
		else
		{
			System.out.println(count);
			int i = 0;
			if(count == 0)
			{
				i = 1;
			}
			for(;i<=9 ;i++)
			{
				Rl(N,count*10+i);
			}
		
		}
	}

}
