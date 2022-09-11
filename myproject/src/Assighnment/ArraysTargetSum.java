package Assighnment;

public class ArraysTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {17,4,5,6,10,11,4,-3,-5,3,15,7};
		int target =arr[0];
		ATS(arr,0,"",0,target);
		

	}
	public static void ATS(int [] arr,int si,String set,int sos,int tar)
	{
		if(si == arr.length)
		{
			if(sos == tar)
			{
				System.out.println(set);
			}
			return;
		}
		
		
		ATS(arr,si+1,set+arr[si]+",",sos+arr[si],tar);
		ATS(arr,si+1,set ,sos,tar);
	}

}
