package prepinstaTCS;

public class NonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,2,3,4,5,4,6};
		rd(arr);
		System.out.println("***************");
		OrE(arr);
		System.out.println("***************");
		NrE(arr);
	}
// remove duplicate
	
	public static void rd(int [] arr)
	{
		for(int i = 0;i <arr.length;i++)
		{
			boolean flag = false;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					flag = true;
				}
			}
			if(flag == false)
			{
				System.out.println(arr[i]);
			}
		}
	}
// only Non repeating element
//{1,2,3,2,3,4,5,4,6};	
	public static void NrE(int [] arr)
	{
		for(int i = 0;i <arr.length;i++)
		{
			boolean flag = false;
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[i] == arr[j]&&i!=j)
				{
					flag = true;
				}
			}
			if(flag == false)
			{
				System.out.println(arr[i]);
			}
		}
	}
	//{1,2,3,2,3,4,5,4,6};
// only repeating element
	public static void OrE(int [] arr)
	{
		for(int i = 0;i <arr.length;i++)
		{
			boolean flag = false;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j]&&i!=j)
				{
					flag = true;
				}
			}
			if(flag == true)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
