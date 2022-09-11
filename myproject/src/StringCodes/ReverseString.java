package StringCodes;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "i.like.this.program.very.much";
		String s = "dog cat cat dog";
		System.out.println(rev(s));

	}
	
	public static boolean rev(String st)
	{
		String s = st;
		String [] arr = st.split(" ");
		System.out.println(arr.length);
		String ans = "";
		for(int i = arr.length-1;i>=0;i--)
		{
			if(ans.length()!=0)
			{
				ans =ans+" "+arr[i];
			}
			else
			{
				ans += arr[i];
			}
		}
		return ans.equals(s);
			
	}

}
