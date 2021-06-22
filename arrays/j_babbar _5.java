import java.io.*;
import java.util.*;
class j_babbar_5 
{
  public static void main(String[] args)throws IOException {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size of the array");
  int n=sc.nextInt();

  int arr[]=new int[n];
  for(int i=0;i<n;i++)
  {
  	arr[i]=sc.nextInt();
  }
  //sorting 
  for(int j=0;j<n-1;j++)
  	{
  		if(arr[j]>arr[j+1])
  		{
  			int t=arr[j];
  			arr[j]=arr[j+1];
  			arr[j+1]=t;
  			j=-1;
  		}
  	}
  	System.out.println("enter the value of k");
    int k=sc.nextInt();
  	/* for(int j=0;j<n;j++)
    {
        System.out.print(arr[j]);
    }*/
    System.out.println("The"+" "+k+"th"+" "+"smallest element is :  "+arr[k-1]);

}
}

