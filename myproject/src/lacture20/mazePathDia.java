package lacture20;

public class mazePathDia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mazePathDia(2,0,0,"");
		//System.out.println(mazePathDiaCount(2,0,0,""));

	}
	public static void mazePathDia(int er,int cr,int cc ,String ans)
	{
		if(er == cr && er == cc)
		{
			System.out.println(ans);
		}
		else if(cr > er || cc > er)
		{
			return;
		}
		else
		{
			mazePathDia(er,cr+1,cc,ans+"V");
			mazePathDia(er,cr,cc+1,ans+"H");
			//if(ans.charAt(0) != 'V'&&ans.lastIndexOf('V') != 0)
				mazePathDia(er,cr+1,cc+1,ans+"D");
		}
	}
//	//// Second Method----------------
//	public static void mazePath2(int er,int ec,int cr,int cc ,String ans)
//	{
//		if(er == cr && ec == cc)
//		{
//			System.out.println(ans);
//		}
//		else if(cr > er || cc > ec)
//		{
//			return;
//		}
//		else
//		{
//			mazePath2(er,ec,cr+1,cc,ans+"V");
//			mazePath2(er,ec,cr,cc+1,ans+"H");
//			//if(cr > er || cc > ec)
//				mazePath2(er,ec,cr+1,cc+1,ans+"D");
//		}
//	}
	
	public static int mazePathDiaCount(int er,int cr,int cc ,String ans)
	{
		if(er == cr && er == cc)
		{
			System.out.println(ans);
			return 1;
		}
		else if(cr > er || cc > er)
		{
			return 0;
		}
		else
		{
			int count = 0;
			count += mazePathDiaCount(er,cr+1,cc,ans+"V");
			count += mazePathDiaCount(er,cr,cc+1,ans+"H");
			count += mazePathDiaCount(er,cr+1,cc+1,ans+"D");
			return count;
		}
	}
}
