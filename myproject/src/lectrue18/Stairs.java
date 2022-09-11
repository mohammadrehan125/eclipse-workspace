package lectrue18;

public class Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Stairs = {2,3,5};
		StairsArray(7,"",Stairs,0);
	//	stairs2(7,"",Stairs,0);
		System.out.println(stairs2(7,"",Stairs,0));

	}
	public static void Stairs(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans+" ");
		}
		else if(n<0)
		{
			return;
		}
		else
		{
			Stairs(n-1,ans+1);
			Stairs(n-2,ans+2);
		}
	}

	public static void Stairs(int n,String ans,int lastStair)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else if(n<0)
		{
			return;
		}
		else
		{
			if(lastStair <= 1)
				Stairs(n-1,ans+1+" ",1);
			Stairs(n-2,ans+2+" ",2);
		}
	}
	
	public static void StairsArray(int n,String ans,int[] Stairs,int lastStair)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else if(n<0)
		{
			return;
		}
		else
		{
			for(int i = lastStair; i < Stairs.length; i++)
			{
				StairsArray(n-Stairs[i],ans+Stairs[i]+" ",Stairs,i);
			}
		}
	}
	public static int stairs2(int n,String ans,int[] stairs,int lastStair) {

		if(n<0)
		{
			return 0;
		}
		if(n == 0)
		{
			//System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			for(int i = lastStair; i < stairs.length;i++)
			{
				count += stairs2(n-stairs[i],ans+stairs[i]+" ",stairs,i);
			}
			return count;
		}	
	}

}
