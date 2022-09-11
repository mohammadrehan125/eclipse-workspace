package prepinstaTCS;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,4,3};
		int smallest = Integer.MAX_VALUE;
		int seconSmall = Integer.MAX_VALUE;
		for(int i = 0; i< arr.length;i++)
		{
			if(arr[i] < smallest)
			{
				smallest = arr[i];
			}
			else if(arr[i] > smallest&&arr[i]<seconSmall)
			{
				seconSmall= arr[i];
			}
		}
		System.out.println(seconSmall);

	}

}
