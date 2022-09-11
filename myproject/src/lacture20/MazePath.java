package lacture20;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(mazePath3(2,2,0,0,""));
		mazePath(2,2,0,0,"");
	}
	public static void mazePath(int er,int ec,int cr,int cc ,String ans)
	{
		if(er == cr && ec == cc)
		{
			System.out.println(ans);
		}
		else if(cr > er || cc > ec)
		{
			return;
		}
		else
		{
			mazePath(er,ec,cr+1,cc,ans+"V");
			mazePath(er,ec,cr,cc+1,ans+"H");
		}
	}
	
	 public static int mazePath2(int er,int ec,int cr,int cc ,String ans)
		{
			if(er == cr && ec == cc)
			{  
	            return 1;
			}
			else if(cr > er || cc > ec)
			{
				return 0;
			}
			else
			{
	            int count = 0;
				count += mazePath2(er,ec,cr+1,cc,ans+"V");
				count += mazePath2(er,ec,cr,cc+1,ans+"H");
	            return count;
			}
		}
	

	

}
