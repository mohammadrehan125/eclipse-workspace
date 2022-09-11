package lac7;

public class kjjjj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,5,4,6,7,8,9,3};
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		for(int i = 0; i < arr.length;i++)
//		{
//			if(arr[i] > max)
//			{
//				max = arr[i];
//			}
//			if(arr[i] < min)
//			{
//				min = arr[i];
//			}
//		}
		//System.out.println(min +"          "+max);
		int ansi = 0;
		int ansj = 0;
		int t = 10;
		int i = 0 ;
		int j = arr.length-1;
		while(i<=j)
		{
			if(arr[i]+arr[j] == t)
			{
				ansi = i;
				ansj = j;
				i++;
				j--;
			}
			else
			{
				i++;
				j--;
			}
		}
		System.out.println(ansi+"    "+ansj);
		
//		String s = "aaabbcccdd";
//		String st = s.charAt(0)+"";
//		
//		String str = "   the sky is blue   ";
//		String ans ="";
//		String [] arr = str.split(" ");
//		
//		for(int i = arr.length-1;i>= 0;i--)
//		{
//			if(ans.length() != 0)
//			{
//				ans+= " "+arr[i];
//			}
//			else
//			{
//				ans += arr[i];
//			}
//		}
//		System.out.println(ans.length());
//		System.out.println(ans);

			//		for(int i = 1; i <s.length();i++)
//		{
//			char curr = s.charAt(i);
//			char prev = s.charAt(i-1);
//			if(curr != prev)
//			{
//				st += curr;
//			}
//		}
//		System.out.println(st);
		
		/*int n = 7;
		int row = 1;
		int nst = 1;
		int nst1 = 1;
		int nsp = n-1;
		int val = 0;
//		while(row <= n)
//		{
//			int c = val;
//			int csp = 1;
//			while(csp <= nsp)
//			{
//				System.out.print(" ");
//				csp++;
//			}
//			int cst = 1;
//			while(cst <= nst)
//			{
//				System.out.print(c+" ");
//				c++;
//				cst++;
//			}
//			row++;
//			nst++;
//			nsp--;
//			System.out.println();
//		}
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst1)
			{
				System.out.print("* ");
				cst++;
			}
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print(" ");
				csp++;
			}
//			int cst1 = 1;
//			while(cst1 <= nst)
//			{
//				System.out.print("* ");
//				cst1++;
//			}
			if(row <= n/2)
			{
				nst1++;
				nst++;
				nsp-= 2;
			}
			else
			{
				nst1--;
				nst--;
				nsp+=2;
			}
			row++;
			System.out.println();
		}*/
//		pr("abc", "");

	}
	
	public static void pr(String s,String ans)
	{
		if(s.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i<s.length();i++)
			{
				String nq = s.substring(0,i)+s.substring(i+1);
				pr(nq,ans+s.charAt(i));
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
