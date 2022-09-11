package lecture21;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[3];
		qp(board,0,2,"");
		//System.out.println(qpCount(board,0,2,""));
	}
	//first Method
	public static void qp(boolean[] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i=0;i<board.length;i++)
			{
				if(board[i] == false)
				{
					board[i] = true;
					qp(board,qpsf+1,tq,ans+"q"+qpsf+" b"+i+" ");
					board[i] = false;
				}
			}
		}
	}
	public static int qpCount(boolean[] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int c=0;
			for(int i=0;i<board.length;i++)
			{
				if(board[i] == false)
				{
					board[i] = true;
					c += qpCount(board,qpsf+1,tq,ans+"q"+qpsf+" b"+i+" ");
					board[i] = false;
				}
			}
			return c;
		}
	}

}
