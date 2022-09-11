package lac16;

public class PDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int i =1;
		PDI(n,i);
		

	}
	public static void PDI(int n,int i)
	{
		if(i==n) 
		{
			System.out.println(i);
			return;
		}
		
			System.out.println(i);
			
			PDI(n,i+1);
			System.out.println(i);
			
			
		
	}

}
