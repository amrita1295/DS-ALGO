
import java.io.*;
import java.util.*;
class j_babbar_1
{
	public static void main(String[] args)throws IOException {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int numbers[]=new int[n];
		System.out.println("Enter the "+n+" "+"numbers : ");
		for(int i=0;i<n;i++)
		{
			numbers[i]=sc.nextInt();
		}

		for(int j=n-1;j>=0;j--)
		{
			System.out.print(numbers[j]+" ");
		}
		
	}
}
