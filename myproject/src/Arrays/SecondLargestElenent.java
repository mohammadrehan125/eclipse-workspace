package Arrays;

public class SecondLargestElenent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {5,2,8,5,6,7,9,10};
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > largest)
			{
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondlargest && arr[i] != largest)
			{
				secondlargest = arr[i];
			}
		}
		if(secondlargest == Integer.MIN_VALUE)
		{
			System.out.println("No second largest element");
		}
		else
		{
			System.out.println("Second largest Element is : "+secondlargest);
		}
		//sle(arr);

	}
	// using sorting
	
	
//	public static void sle(int [] arr)
//	{
//		int temp ;
//		for(int i = 0;i <arr.length-1;i++)
//		{
//			for(int j = i+1;j <arr.length;j++)
//			{
//				if(arr[j] > arr[i])
//				{
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			if(i == 1)
//			{
//				System.out.println("Second largest Element is : "+arr[i]);
//				break;
//			}
//		}
//	}

}
