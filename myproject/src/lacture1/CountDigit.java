package lacture1;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 12345;
		int i=1;
		while(i<=n)
		{
			n = n/10;
			i++;
		}
		System.out.println(i);
 
	}

}
