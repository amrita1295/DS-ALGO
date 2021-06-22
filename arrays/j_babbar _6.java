import java .io.*;
import java.util.*;
class j_babbar_6
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int arr[]={-2,36,-8,-9,10,23,52,46,-93};
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			if(arr[left]<0 && arr[right]<0)
			
				left++;
				
			
			else if(arr[left]>0 && arr[right]<0)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}

			else if(arr[left]>0 && arr[right]>0)
			   right--;
			
			else
			{
				left++;
				right--;
			}
		}
	
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}