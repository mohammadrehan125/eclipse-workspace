package StringCodes;

public class ReverseStringKtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sb = new StringBuffer();
		String str = "abcxyz";
		//for(int i =0;i<2;i++)
			RSK(str,3);
		System.out.println(sb);

	}
	public static StringBuffer sb = new StringBuffer();
	public static void RSK(String str,int k)
	{
		
		char[] arr = str.toCharArray();
		for(int j =0;j<k;j++)
		{
			char ch = arr[arr.length-1];
			for(int i = arr.length-2;i >= 0 ;i--)
			{
				arr[i+1] = arr[i];
			}
			arr[0] = ch;
		}
		
		for(char c : arr)
		{
			sb.append(c);
		}
		
		
	}

}
