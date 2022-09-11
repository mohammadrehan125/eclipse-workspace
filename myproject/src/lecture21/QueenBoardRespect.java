package lecture21;

public class QueenBoardRespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		qc2(board,0,2,"",0);

	}
	
	public static void qc(boolean[]board,int qpsf,int tq,String ans,int pos)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			if(pos < board.length)
			{
			//queen place
				board[pos] = true;
				qc(board,qpsf+1,tq,ans+"b"+pos+" ",pos+1);
				board[pos] = false;
			
			// queen Not place
				qc(board,qpsf,tq,ans,pos+1);
			}
		}
	}

	public static void qc2(boolean[]board,int qpsf,int tq,String ans,int pos)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else if(pos >= board.length)
		{
			return;
		}
		else
		{
		//queen place
			board[pos] = true;
			qc2(board,qpsf+1,tq,ans+"b"+pos+" ",pos+1);
			board[pos] = false;
			
		// queen Not place
			qc2(board,qpsf,tq,ans,pos+1);
		}
	}
}
