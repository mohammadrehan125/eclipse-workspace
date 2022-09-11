package Arrays;
import java.util.HashSet;

public class CommonInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {2,3,5,6,4};
		int [] arr2 = {2,5,6,4,8};
		CEA2(arr1,arr2);

	}
	
	public static void CEA(int[] arr1,int[] arr2)
	{
		for(int i = 0 ; i< arr1.length;i++)
		{
			for(int j = 0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr2[j]+" ");
				}
			}
		}
	}
	
	public static void CEA2(int[] arr1,int[] arr2)
	{
		HashSet<Integer> hs = new HashSet<>();
		for(int no : arr1)
		{
			hs.add(no);
		}
		for(int no : arr2)
		{
			if(hs.contains(no))
			{
				System.out.print(no+" ");
				
			}
		}
	}

}
