package lac7;

public class Roatate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		System.out.println(noOfDigit(n));
		 rotate4(n,1);

	}
	public static int noOfDigit(int n)
	{
		int count = 0;
		count = (int)Math.log10(n)+1;
		return count ;
	}
	public static void rotate(int n,int x)
	{
		int nod = noOfDigit(n);
		//One rotation
		for(int i = 1; i <= x;i++)
		{
			int newno = n%10*(int)Math.pow(10,nod-1)+n/10;
			n = newno;
			
		}
		System.out.println(n);
	}
	//no of rotation repeat nhi ho
	public static void rotate2(int n,int x)
	{
		int nod = noOfDigit(n);
		x = x%nod;
		for(int i = 1; i <= x;i++)
		{
			int newno = n%10*(int)Math.pow(10,nod-1)+n/10;
			n = newno;
		}
		System.out.println(n);
	}
	// if rotations -ve krni ho
	public static void rotate3(int n,int x)
	{
		int nod = noOfDigit(n);
		x = x%nod;
		if(x<0)
		{
			x = x+nod;
		}
		for(int i = 1; i <= x;i++)
		{
			int newno = n%10*(int)Math.pow(10,nod-1)+n/10;
			n = newno;
		}
		System.out.println(n);
	}
	//Rotations without using a loop
	public static void rotate4(int n,int x)
	{
		int nod =  noOfDigit(n);
		x %=nod;
		int newNo = n%(int)Math.pow(10,x)*(int)Math.pow(10,nod-x)+n/(int)Math.pow(10,x);
		n = newNo;
		System.out.println(n);
	}
	
	
}
