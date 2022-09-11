package lacture9;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5,6,7};
        rotateN(arr,3);

        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int [] arr)
    {
        int temp= arr[arr.length-1];
        for(int i =arr.length-2;i>=0;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }  
    
    public static void rotateN(int [] arr,int r)   
    {
          for(int i = 1; i <= r; i++)
          {
              rotate(arr);
          }

	}

}
