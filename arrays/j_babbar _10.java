import java.util.*;
class j_babbar_10
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
                 arr[i][j]=sc.nextInt();
			}
		}
		//90 rotation
		for(int j=0;j<m;j++)
		{
			for(int i=n-1;i>=0;i--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}