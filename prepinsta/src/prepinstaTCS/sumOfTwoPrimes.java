package prepinstaTCS;
import java.util.*;
public class sumOfTwoPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from user
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		int x = 0;
		for(int i = 2 ; i <= number/2 ; i++)
		{
			if(prime_or_not(i))
			{
				if(prime_or_not(number-i))
				{
					System.out.println(number+ " = "+i+" + "+(number-i));
					x = 1;
				}
			}
		}
		if(x == 0)
			System.out.println(+number+" cannot be expressed as a sum of two prime numbers");
	}
		
	public static boolean prime_or_not(int n)
	{
	int count = 0;
	for(int i = 1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count == 2)
	{
		return true;
	}else
	{
    return false;
	}
	
	}

}
