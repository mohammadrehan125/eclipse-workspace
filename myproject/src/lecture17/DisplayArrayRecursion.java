package lecture17;

public class DisplayArrayRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = { 1,2,3,4,5,6};
		display(arr,0);
		
	}
	public static void display(int arr[],int id)
	{
		if(id == arr.length)
		{
			return ;
		}
		else
		{
		System.out.println(arr[id]);
		display(arr,id+1);
		
		
		// for reverse print
		 
		//System.out.println(arr[id]);
		}
	}

}
