package lecture21;

public class QueenCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		qc(board,0,2,"",-1);
		//System.out.println(qc2(board,0,2,"",-1));

	}
	
	// First method-----------
	public static void qc(boolean[] board,int qpsf,int tq,String ans,int lastplace)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i=lastplace+1;i<board.length;i++)
			{
				if(board[i] == false)
				{
					board[i] = true;
					qc(board,qpsf+1,tq,ans+"q"+qpsf+" b"+i+" ",i);
					board[i] = false;
				}
			}
		}
	}
	//Second Method**************
	
	public static int qc2(boolean[] board,int qpsf,int tq,String ans,int lastplace)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int c=0;
			for(int i=lastplace+1;i<board.length;i++)
			{
				c += qc2(board,qpsf+1,tq,ans+"q"+qpsf+" b"+i+" ",i);
			}
			return c;
		}
		
	}
}
